import java.util.ArrayList;
import java.util.Random;

public class Drum {

    private ArrayList<Ball> allBalls = new ArrayList<>();
    Random generator = new Random();

    public Drum() {
    }

    protected void collectAllBalls(){
        for (int i = 0; i < 45; i++){
            int ballNumber = i + 1;
            allBalls.add(new Ball(ballNumber));
        }
    }

    protected Ball scoopBall(){
        Ball scooped = // dit moet kijken naar wat de randomGenerator teruggeeft en op basis daarvan de Ball in
        // allBalls erbij zoeken die dat nummer als field heeft. Deze ball wordt vervolgens in scoreboard.score
        // geplaatst zodat die niet opnieuw gekozen kan worden. Dus de random bound moet even groot zijn als de
        // allBalls.size() (of zo).
        //

        return Ball
    }

    private int randomGenerator(){
        return generator.nextInt(1, 46);
    }

    public ArrayList<Ball> getAllBalls() {
        return allBalls;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "allBalls=" + allBalls +
                '}';
    }
}
