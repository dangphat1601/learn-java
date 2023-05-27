package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        // <18 || 18-55 || > 55

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if(clientAge < 18){
            System.out.println("do not sell to people under 18 years old");
            if(clientAge < 14){
                System.out.println("SOS");
            }
        } else if (clientAge <= 55){
            System.out.println("Ok! wait a bit");
        } else{
            System.out.println("do not sell to people over 55 years old");
        }
    }
}
