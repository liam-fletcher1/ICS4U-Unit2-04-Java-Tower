/*
 * This program solves the Towers of Hanoi 
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-02
 */

import java.util.Scanner;

public final class Tower {
    private Tower() {

    }
    /**
     * This function solves the Towers of Hanoi algorithm.
     * @param diskNumber
     * @param fromPeg
     * @param toPeg
     * @param sparePeg
     */
    static void solveTowers(final int diskNumber, final char fromPeg,
        final char toPeg, final char sparePeg) {
        if (diskNumber == 1) {
            System.out.println("Moving disk 1 from peg " + fromPeg +
                " to peg " + toPeg);
            return;
        }

        // Calling the solving function
        solveTowers(diskNumber - 1, fromPeg, sparePeg, toPeg);

        // Printing the move 
        System.out.println("Moving disk " + diskNumber + " from peg " + fromPeg +
            " to peg " + toPeg);

        // Calling the solving function
        solveTowers(diskNumber - 1, sparePeg, toPeg, fromPeg);
    }

    /**
     * This function accepts input for the number of disks and passes it to
     * another function
     * @param args
     */
    public static void main(final String[] args) {
        try {
            // User input 
            Scanner userInput = new Scanner(System.in);
            System.out.print("How many disks in your tower (1 ->): ");
            int userDisks = userInput.nextInt();

            // Calling the function 
            if (userDisks < 1) {
                throw null;
            } else {
                solveTowers(userDisks, '1', '3', '2');
            }

            // Output 
            System.out.println("");
            System.out.println("Done.");

            // Catches 
        } catch (NullPointerException e) {
            System.out.println("");
            System.out.println("Invaild Input");
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Invalid Input");
        }
    }
}
