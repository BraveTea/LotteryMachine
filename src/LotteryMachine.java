
public class LotteryMachine {

    private final Scoreboard scoreboard = new Scoreboard();
    private final Drum drum = new Drum();
    private final int numberOfRegularTubes = 6; //how many regular balls will be scooped?

    public LotteryMachine() {
    }

    protected void executeDraw(){
        drum.collectAllBalls();
        scoreboard.empty();
        for (int i = 0; i < numberOfRegularTubes; i++){
            Ball ball = drum.scoopBall();
            scoreboard.placeBall(ball);
        }
        scoreboard.placeBonusBall(drum.scoopBall());
        scoreboard.sort();
        System.out.println(scoreboard);
    }
}
