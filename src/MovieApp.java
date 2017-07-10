import java.util.Scanner;

/**
 * Created by Mark on 7/7/2017.
 */
public class MovieApp {

    public static void main(String[] args) {
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Welcome");
            System.out.println("scifi, comedy, drama, action, musical");
            System.out.println("what category do you want");

            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            Movies list = new Movies();

            for (Movies m : list.listOfMovies()) {
                if ((userInput.equalsIgnoreCase(m.getCategory()))) {
                    System.out.println(m);
                }
            }
            System.out.println("Would you like to continue:");
            System.out.println("Please enter Y or N: ");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye");

    }
}

