import java.util.ArrayList;


public class Scoreboard {

    private ArrayList<Ball> score = new ArrayList<>();

    public Scoreboard() {
    }

    protected void empty(){
        score.clear();
    }

    @Override
    public String toString() {
        return "Scoreboard{" +
                "score=" + score +
                '}';
    }
}
