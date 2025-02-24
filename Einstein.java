import java.util.Scanner;

/**
 * This program performs E=mc^2
 * given the mass.
 *
 * <p>This class demonstrates proper JavaDoc formatting and usage of
 * various math operations.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-02-21
 */

public final class Einstein {
    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */

    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */

    public static void main(String[] args) {
        // setting speed of light
        final double SPEED_OF_LIGHT = 2.998e8;

        // making scanner for input
        final Scanner scanner = new Scanner(System.in);

        // try catch for errors
        try {
            System.out.print("Enter the mass of the object in kilograms: ");
            // Getting mass from user
            final String massString = scanner.nextLine();
            final double mass = Double.parseDouble(massString);

            // Making sure the mass is not negative with if statement
            if (mass < 0) {
                // outputting negative message
                System.out.println("Mass cannot be negative.");
            } else {
                // calculating energy
                final double energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
                // Outputting energy
                System.out.printf("The energy released is %.3e J.%n", energy);
            }
        } catch (NumberFormatException ex) {
            // Handling errors
            System.out.println("Please enter a number for the mass.");
        } finally {
            scanner.close();
        }
    }
}
