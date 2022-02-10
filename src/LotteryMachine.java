public class LotteryMachine {

    private Scoreboard scoreboard = new Scoreboard();
    private Drum drum = new Drum();

    public LotteryMachine() {
    }

    protected void executeDraw(){
        drum.collectAllBalls();
        scoreboard.empty();
        for (int i = 0; i < 6; i++){

        }
    }

}
