import java.util.Scanner;

/**
 * Created by Steve on 7/18/2017.
 */
public class Validator {
    Scanner scan = new Scanner(System.in);
    int userInt;
    double userDouble;

    public int numberIsInteger() {
        boolean isValid = false;
        do {
            if (scan.hasNextInt()) {
                userInt = scan.nextInt();
                isValid = true;
            } else {
                System.out.println("Not an integer! Enter valid integer: ");
            }
            scan.nextLine();
        } while (!isValid);
        return userInt;
    }

    public int numberIsBetweenTwoNumbers(int lowerBound, int upperBound) {

        do {
            numberIsInteger();
            while (userInt < lowerBound || userInt > upperBound) {
                System.out.println("Entry is not in bounds. Please re-enter number.");
                numberIsInteger();
            }
        } while (userInt < lowerBound && userInt > upperBound);
        return userInt;
    }
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
    public double numberIsDouble(){
        boolean isValid = false;
        do {
            if (scan.hasNextDouble()) {
                userDouble = scan.nextDouble();
                isValid = true;
            } else {
                System.out.println("Invalid Entry! Enter valid number: ");
            }
            scan.nextLine();
        } while (!isValid);
        return userDouble;
    }
    public boolean validateUsed() {
        boolean isValid = false;

        do {
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                isValid = true;
            } else if (choice.equalsIgnoreCase("n")) {
                return isValid;
            } else {
                System.out.println("Invalid entry, please type 'y' to continue or 'n' to continue.");
            }

        } while (!isValid);

        return isValid;
    }
}
