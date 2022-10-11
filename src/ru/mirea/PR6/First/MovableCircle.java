package ru.mirea.PR6.First;

public class MovableCircle implements Movable {
    private int r;
    MovablePoint center;

    public MovableCircle(int r, int x, int y, int xSpeed, int ySpeed){
        this.r = r;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public int getR() {
        return r;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public String toString(){
        return "Center(" + center.x + ", " + center.y  +  "), r = " + r;
    }
}
