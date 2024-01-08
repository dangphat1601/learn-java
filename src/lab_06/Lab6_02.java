package lab_06;

import java.util.Scanner;

public class Lab6_02 {
    public static void main(String[] args) {

        /* LAB 6.2
         * String myPassword = "password123";
         * Allow user to input maximum 3 times
         * */

        String myPassword = "password123";
        int maxInput = 3;
        int input = 0;

        Scanner scanner = new Scanner(System.in);

        while (input < maxInput) {
            System.out.println("Please enter your password then press enter key: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(myPassword)) {
                System.out.println("Password is correct!");
                break;
            } else {
                input++;
                int remainingInput = maxInput - input;
                System.out.println("Incorrect password. You have " + remainingInput + " to retry.");
            }
        }

        if (input == maxInput) {
            System.out.println("Maximum number of attempts reached. Please try again later.");
        }

    }
}
