public class Player {
    private String firstName;
    private String lastName;
    private int score;

    // Player constructor
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = 0;
    }

    //Get score
    public int getScore() {
        return score;
    }

    //add to score
    public void addToScore() {
        this.score += 1;
    }

    // Print out name of player :)
    public String getFullName() {
        return (firstName + " " + lastName);
    }
}
