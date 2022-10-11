package ru.mirea.PR6.First;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed = 0;
    protected int ySpeed = 0;

    public MovablePoint(int x, int y, int xSpeed,
    int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {

        x += xSpeed;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y  +  ")" + " ," + "xSpeed = " + xSpeed + ", " + "ySpeed = " + ySpeed;
    }
}
