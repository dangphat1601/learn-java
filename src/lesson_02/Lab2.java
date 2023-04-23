package lesson_02;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int inputNumber = scanner.nextInt();

        if(inputNumber % 2 ==0){
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
        System.out.println("END");
    }
}
