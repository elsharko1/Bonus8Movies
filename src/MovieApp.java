import java.util.Scanner;

/**
 * Created by Mark on 7/7/2017.
 */
public class MovieApp {

    public static void main(String[] args) {
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Welcome to Mark's Video Palace");
            System.out.println("Which Category of moive would you like to watch???");
            System.out.println("");
            System.out.println("Please select: ");
            System.out.println("Scifi, Comedy, Drama, Action, Musical");


            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            Movies list = new Movies();

            System.out.println("Here's a list of all of our " + userInput + " movies: ");
            System.out.println("");
            for (Movies m : list.listOfMovies()) {
                if ((userInput.equalsIgnoreCase(m.getCategory()))) {
                    System.out.println(m);
                }
            }
            System.out.println("");
            System.out.println("Would you like to continue:");
            System.out.println("Please enter Y or N: ");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye");

    }
}

