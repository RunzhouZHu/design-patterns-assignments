import java.util.Scanner;

public class Character {
    private static Scanner sc = new Scanner(System.in);
    private Level level;
    private String name;
    private int experience_points;
    private int health_points = 200;


    public Character() {
        level = new NoviceLevel(this);
    }

    public void startGame() {
        System.out.println("Thank you for playing this game, please enter your name: ");
        name = sc.nextLine();

        while (true) {
            if (level == null) {
                System.out.println("ERROR!");
                return;
            }

            printPlayerState();

            // hp less than 0 defeat
            if (health_points <= 0) {
                System.out.println("You are defeated! Game over!");
                return;
            }

            if (level instanceof MasterLevel) {
                System.out.println("You win!");
                return;
            }

            level.action();
        }
    }

    public void train() {
        experience_points += 100; // The number can ba changed
        System.out.println("Now training...");
    }

    public void meditate() {
        health_points += 100; // The number can ba changed
        System.out.println("Now meditating...");
    }

    public void fight() {
        health_points -= 100; // The number can ba changed
        experience_points += 100; // The number can ba changed
        System.out.println("Now fighting...");
    }


    public int readPlayerChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i - 1]);
        }
        // read user input
        return sc.nextInt();
    }

    public int getExp() {
        return experience_points;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void printPlayerState() {
        System.out.println("Hello " + name + "!");
        System.out.println("You have " + experience_points + " experience points.");
        System.out.println("You have " + health_points + " health points.");
    }
}
