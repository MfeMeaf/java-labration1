public class Game {
    static String start(int bestOf, Player p1, Player p2) {
        String win = "";
        int turn = 1;
        boolean game = true;
        while (game) {
            // This if statement checks that both players don't have enough score to win.
            if (p1.getScore() != bestOf && p2.getScore() != bestOf) {
                IO.println("\n\nTurn " + turn);
                turn++;
                //Here we say who is going to throw next and the value of their throw
                IO.println(p1.getFullName() + "s time to throw the dice");
                //Throws the dice and sets it as an int
                int p1Throw = Dice.throwDice();

                IO.println(p1.getFullName() + " has thrown a total value of: " + p1Throw);

                IO.readln("Press Enter to continue\n");

                IO.println(p2.getFullName() + "s time to throw the dice");
                int p2Throw = Dice.throwDice();

                IO.println(p2.getFullName() + " has thrown a total value of: " + p2Throw);

                IO.readln("Press enter to continue\n");
                //Compare the two throws from each player
                if (p1Throw > p2Throw) {
                    //This is run if p1 has a higher total throw than p2
                    p1.addToScore();
                    IO.println(p1.getFullName() + " has scored\n\n");

                } else {
                    // This is run otherwise ^^
                    p2.addToScore();
                    IO.println(p2.getFullName() + " has \n\n");
                }
                // Prints out the score of each player
                IO.readln("The score is| \n" +
                        p1.getFullName() + " has: " + p1.getScore()
                        + "\n" +
                        p2.getFullName() + " has: " + p2.getScore()
                );

                // Here we check if p1 has gotten the score needed to win
            } else if (p1.getScore() == bestOf) {
                win = (p1.getFullName() + " Wins the game!!!");
                game = false;
            }
            // The following is run if p2 has gotten the score needed to win
            else {
                win = (p2.getFullName() + " Wins the game!!!!");
                game = false;
            }
        }
        IO.println(win);
        return win;
    }

}
