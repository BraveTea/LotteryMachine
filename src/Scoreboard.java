import java.util.ArrayList;

public class Scoreboard {

    private ArrayList<Ball> score = new ArrayList<>();
    private Ball bonusBall;

    public Scoreboard() {
    }

    protected void placeBall(Ball ball){
        score.add(ball);
    }

    protected void placeBonusBall(Ball ball){
        bonusBall = ball;
    }

    protected void empty(){
        score.clear();
    }

    //This code was provided by the assignment. I do not fully understand it. TODO Need to figure this out!
    protected void sort(){
        for (int i = score.size(); i > 0; i--){
            for (int j = 0; j < i-1; j++){
                if (score.get(j).isBiggerThan(score.get(j+1))){
                    Ball ball = score.get(j);
                    score.set(j, score.get(j + 1));
                    score.set (j + 1, ball);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Balls: " + score + " Bonus Ball: " + bonusBall;
    }
}
