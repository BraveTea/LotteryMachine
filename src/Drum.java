import java.util.ArrayList;
import java.util.Random;

public class Drum {

    private ArrayList<Ball> allBalls = new ArrayList<>();
    private Random generator = new Random();
    private final int numberOfBalls = 45;

    public Drum() {
    }

    protected void collectAllBalls(){
        for (int i = 1; i < numberOfBalls + 1; i++){
            allBalls.add(new Ball(i));
        }
    }

    protected Ball scoopBall(){
        Ball ball = allBalls.get(randomGenerator(1, allBalls.size())); //returns a random Ball in allBalls list
        allBalls.remove(ball);
        return ball;
    }

    //I think that I would normally put this in a class with a few overloaded methods. Sticking to the assignment I won't
    private int randomGenerator(int origin, int bound){
        return generator.nextInt(origin, bound);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "allBalls=" + allBalls +
                '}';
    }
}
