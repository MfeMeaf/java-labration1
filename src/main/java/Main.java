public class Main {
    static void main() {
        // https://www.geeksforgeeks.org/java/how-to-print-colored-text-in-java-console/
        // Ask player for inputs of first name and last name then create a new Player with those
        String p1firstName = IO.readln("Input player 1 first name: ");
        String p1lastName = IO.readln("Input player 1 Last name: ");
        Player p1 = new Player(p1firstName, p1lastName);

        // Same as above but for 2nd player
        String p2firstName = IO.readln("\nInput player 2 first name: ");
        String p2lastName = IO.readln("Input player 2 Last name: ");
        Player p2 = new Player(p2firstName, p2lastName);

        // This prints out who is playing
        IO.println("\nPlayers are: \n" + p1.getFullName() + "\n" + p2.getFullName());

        String bestOf = IO.readln("""
                Select winning score
                1. Winning score 3
                2. Winning score 5
                3. Winning score 7
                4. Winning score 9
                """);

        // Switch case for player selection of the score needed to win
        switch (bestOf) {
            case "1":
                Game.start(1, p1, p2);
                break;
            case "2":
                Game.start(5, p1, p2);
                break;
            case "3":
                Game.start(7, p1, p2);
                break;
            case "4":
                Game.start(9, p1, p2);
                break;
            default:
                IO.println("Could not confirm winning score");

        }
    }
}
