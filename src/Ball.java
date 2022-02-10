public class Ball {

    private int number;

    public Ball(int number) {
        this.number = number;
    }

    public boolean isBiggerThan(Ball differentBall){
        return number > differentBall.number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball Number: " + number;
    }
}
