
public class LotteryMachine {

    private Scoreboard scoreboard = new Scoreboard();
    private Drum drum = new Drum();
    private int numberOfRegularBalls = 6;

    public LotteryMachine() {
    }

    protected void executeDraw(){
        drum.collectAllBalls();
        scoreboard.empty();
        for (int i = 0; i < numberOfRegularBalls; i++){
            Ball ball = drum.scoopBall();
            scoreboard.placeBall(ball);
        }
        scoreboard.placeBonusBall(drum.scoopBall());
        scoreboard.sort();
        System.out.println(scoreboard);
    }


}
