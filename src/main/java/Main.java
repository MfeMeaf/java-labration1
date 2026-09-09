public class Main {
    static void main() {

        boolean game = true;
        String p1firstName = IO.readln("Input player 1 first name: ");
        String p1lastName = IO.readln("Input player 1 Last name: ");
        Player p1 = new Player(p1firstName, p1lastName);


        String p2firstName = IO.readln("Input player 2 first name: ");
        String p2lastName = IO.readln("Input player 2 Last name: ");
        Player p2 = new Player(p2firstName, p2lastName);

        IO.println("Players are: \n" + p1.getFullName() + "\n" + p2.getFullName());


        String bestOf = IO.readln("Select winning score\n 1. best of 3 \n " +
                "2. best of 5 " +
                "3. best of 7" +
                "4. best of 9");
        switch (bestOf) {
            case "1":
                Game.start(3);
                break;
            case "2":
                Game.start(5);
                break;
            case "3":
                Game.start(7);
                break;
            case "4":
                Game.start(9);
                break;
            default:
                IO.println("Could not confirm winning score");
        }
    }
}
