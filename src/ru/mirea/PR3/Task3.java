package ru.mirea.PR3;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for(int i = 0; i < 4; i++){
            arr[i] = Randint(10, 99);
        }

        for (int i = 0; i < 4; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        if (Check(arr)){
            System.out.println("Yes, ascending sequence");
        }
        else{
            System.out.println("No, descending sequence");
        }

    }
    public static int Randint(int left, int right){
        return left + (int) (Math.random() * (right - left +1));
    }

    public static boolean Check(int[] checkArr){
        for (int i = 0; i < 3; i++){
            if (checkArr[i] > checkArr[i+1]){
                return false;
            }
        }
        return true;
    }

}
