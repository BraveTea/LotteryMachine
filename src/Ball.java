public class Ball {

    private int number;

    public Ball(int number) {
        this.number = number;
    }

    protected boolean isBiggerThan(Ball differentBall){
        return number > differentBall.number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
