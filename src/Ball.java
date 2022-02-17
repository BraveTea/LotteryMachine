public class Ball {

    private int number;

    public Ball(int number) {
        this.number = number;
    }

    protected boolean isBiggerThan(Ball differentBall){
        return number > differentBall.number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
