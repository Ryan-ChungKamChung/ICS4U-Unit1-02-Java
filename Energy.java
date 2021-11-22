/*
 * This program calculates how much energy would be generated from a certain
 * amount of mass.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-11-19
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This class contains the calculations used to determine the amount of energy
* would be generated from a certain amount of mass.
*/
final class Energy {

    // Public Constant Declarations
    /**
     * This constant represents the speed of light.
     */
    public static final double LIGHT_SPEED = 2.998 * Math.pow(10, 8);

    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Calculates and outputs the energy generated from a certain amount of
     * mass.
     *
     * @param args No args will be used.
     * @throws IOException if there is anything wrong with the input
     * @throws NumberFormatException if the input isn't a float
     * */
    public static void main(final String[] args)
            throws NumberFormatException, IOException {

        // Variable Declarations
        final double mass;
        final double energy;

        try {
            // User prompt
            System.out.print("Enter the mass (kg): ");

            // Gathering the user input
            final BufferedReader inputReader = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            // Converts the input to float
            mass = Float.parseFloat(inputReader.readLine());

            // Calculates the amount of energy (E = mc²)
            energy = mass * Math.pow(LIGHT_SPEED, 2);

            // Outputs the result of the calculation to the user
            System.out.println("This mass would create " + energy + " J");
        } catch (NumberFormatException | IOException exception) {
            System.out.println("That wasn't a number.");
        }

        System.out.println("\nDone.");

    }

}

