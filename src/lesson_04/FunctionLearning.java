package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {
    public static void main(String[] args) {
        /* //parameter(s): name  (string name)
        //argument(s): "Phat" "Dang Huu Phat"
        getUserName("Phat");
        getUserName("Dang Huu Phat");*/

        /*System.out.println("Random number is: " + getARandomNumber(2));
        System.out.println("Random number is: " + getARandomNumber(10));*/

        printNumber();
    }

    /*public static void getUserName(String name) {
        System.out.println("Hello: ");
    }*/
    public static int getARandomNumber(int boundary) {
        int randomNumber = new SecureRandom().nextInt(boundary);
        return randomNumber;
        //or return new SecureRandom().nextInt(1000);
    }
    public static void printNumber(){
        for (int index = 0; index < 10; index++) {
             if (index == 8){
                 System.out.println("You have reached the magic number!");
                 return;
             }
             else System.out.println(index);
        }

    }

}
