package lab_02;

import java.util.Scanner;

public class Lab2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Height(m): ");
        int inputHeight = scanner.nextInt();
        System.out.print("Please enter Weight(kg): ");
        int inputWeight = scanner.nextInt();
        float BMI = inputWeight % (inputHeight*2);
        //float BMI = 121313;
        System.out.printf("%.2f %n",BMI);

        if (BMI <= 18.5){
            System.out.println("Underweight");
        } else if (BMI < 24.9) {
            System.out.println("Normal weight");
        } else if (BMI < 29.9) {
            System.out.println("Overweight");
        } else{
            System.out.println("Obesity");
        }
        System.out.println("END");
    }
}
