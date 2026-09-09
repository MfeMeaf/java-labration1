import java.util.random.RandomGenerator;

public class Dice {
    static int throwDice() {
        IO.readln("Press Enter to throw dice 1");
        // Make a new int that is a randomised number between 1 and 6
        int throw1 = RandomGenerator.getDefault().nextInt(1, 7);
        IO.println("Dice score: " + throw1);
        IO.readln("Press Enter to throw dice 2");
        int throw2 = RandomGenerator.getDefault().nextInt(1, 7);
        IO.println("Dice score: " + throw2);

        //Return the score of each throw
        return throw1 + throw2;
    }
}
