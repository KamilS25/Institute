
package ru.mirea.PR30;


import java.util.Stack;

public class BinaryTree {
    public Node root;

    BinaryTree() {
        root = null;
    }

    public Node getRoot(){
        return root;
    }

    public Node find(int value) {

        Node curr = root;

        while (curr.getValue() != value) {

            if (curr.getValue() > value) {
                curr = curr.getLeftChild();
            } else {
                curr = curr.getRightChild();
            }

            if (curr == null) {
                return null;
            }
        }

        return curr;
    }

    public void insert(int value) {

        Node newNode = new Node();
        Node parent;

        newNode.setValue(value);

        if (root == null) {
            root = newNode;
        } else {
            Node curr = root;

            while (true) {

                parent = curr;
                if (curr.getValue() == value) {
                    System.out.println("Such element already exist!");
                    return;
                } else if (curr.getValue() > value) {
                    curr = curr.getLeftChild();

                    if (curr == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else {
                    curr = curr.getRightChild();

                    if (curr == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int value) {

        Node curr = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (curr.getValue() != value) {

            parent = curr;

            if (curr.getValue() > value) {

                curr = curr.getLeftChild();
                isLeftChild = true;
            } else {
                curr = curr.getRightChild();
                isLeftChild = false;
            }

            if (curr == null) {
                return false;
            }
        }

        if (curr.getRightChild() == null && curr.getLeftChild() == null) {

            if (curr == root) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
        } else if (curr.getRightChild() == null) {

            if (curr == root) {
                root = curr.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(curr.getLeftChild());
            } else {
                parent.setRightChild(curr.getLeftChild());
            }
        } else if (curr.getLeftChild() == null) {
            if (curr == root)
                root = curr.getRightChild();
            else if (isLeftChild)
                parent.setLeftChild(curr.getRightChild());
            else
                parent.setRightChild(curr.getRightChild());
        } else {
            Node heir = receiveHeir(curr);
            if (curr == root)
                root = heir;
            else if (isLeftChild)
                parent.setLeftChild(heir);
            else
                parent.setRightChild(heir);

            heir.setLeftChild(curr.getLeftChild());
        }
        return true;
    }

    private Node receiveHeir(Node node) {

        Node parent = node;
        Node heir = node;
        Node curr = node.getRightChild();

        while (curr != null) {

            parent = heir;
            heir = curr;
            curr = curr.getLeftChild();
        }

        if (heir != node.getRightChild()) {

            parent.setLeftChild(heir.getRightChild());
            heir.setRightChild(node.getRightChild());
        }

        return heir;
    }

    public static void reverseTree(final Node root) {
        if (root == null)
            return;

        final Node temp = root.getRightChild();
        root.setRightChild(root.getLeftChild());
        root.setLeftChild(temp);

        reverseTree(root.getLeftChild());
        reverseTree(root.getRightChild());
    }

    public int height(Node root) {
        if (root == null)
            return 0;
        else {

            int leftHeight = height(root.getLeftChild());
            int rightHeight = height(root.getRightChild());

            return (leftHeight > rightHeight) ?
                    (leftHeight + 1) :
                    (rightHeight + 1);
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int gaps = 33;
        boolean isRowEmpty = false;
        String sep = ".............................................................................................";
        System.out.println(sep);
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    localStack.push(temp.getLeftChild());
                    localStack.push(temp.getRightChild());
                    if (temp.getLeftChild() != null || temp.getRightChild() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println(sep);
    }

}

