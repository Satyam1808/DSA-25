package Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class basic_08 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        float mulNum = 0;

        try {
            System.out.println("Enter first decimal number: ");
            float fNum = sc.nextFloat();

            System.out.println("Enter second decimal number: ");
            float sNum = sc.nextFloat();

            // Check if both numbers are actually decimal (have fractional parts)
            if ((fNum % 1 != 0) && (sNum % 1 != 0)) {
                mulNum = fNum * sNum;
                System.out.println("Multiplication of numbers is: " + mulNum);
            } else {
                System.out.println("Please enter decimal numbers only (e.g., 12.34, 5.67).");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric decimal values.");
        } finally {
            sc.close(); // Close the scanner
        }
    }
}
