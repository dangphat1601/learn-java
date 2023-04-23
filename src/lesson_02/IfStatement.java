package lesson_02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        final int EXPECTED_INPUT = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number to check On time: ");
        int arrivalTime = scanner.nextInt();
        boolean isOnTime = arrivalTime <= EXPECTED_INPUT;

        System.out.println("Result to check On time: ");
//        if (isOnTime){
//            System.out.println("On time!!!!");
//        } else {
//            System.out.println("Not On time :");
//        }
        //Ternary operator
        String outputMsg = isOnTime ? "On time!!!!" : "Not On time" ;
        System.out.println(outputMsg);
        System.out.println("End");
    }
}
