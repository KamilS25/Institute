package PR2;

public class TestBall {
    public static void main(String[] args){

        Ball ball = new Ball(0, 0);
        System.out.println(ball);
        ball.setX(1);
        ball.setY(0.5);
        System.out.println(ball);
        ball.move(2, 3.5);
        System.out.println(ball);

    }
}
