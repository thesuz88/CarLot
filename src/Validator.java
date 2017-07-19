import java.util.Scanner;

/**
 * Created by Steve on 7/18/2017.
 */
public class Validator {
    Scanner scan = new Scanner(System.in);
    int userInt;

    public int numberIsPositiveInteger(int i) {
        boolean validInt = false;
        do {

            if (scan.hasNextInt()) {
                userInt = scan.nextInt();
                validInt = true;
                if (userInt < i) {
                    System.out.println("Not a positive integer. Please enter valid choice: ");
                    validInt = false;
                }
            } else {
                System.out.println("Not an integer. Please enter valid choice: ");
            }
            scan.nextLine();
        } while (!validInt);

        return userInt;
    }
}
