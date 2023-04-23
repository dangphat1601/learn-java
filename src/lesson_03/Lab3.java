package lesson_03;

public class Lab3 {

    /*   LAB 3.1
     === Count how many odd, even number(s) in an integer array ===
            int[] intArr = {1, 2, 3, 4, 5};
            Even numders: 2
            Odd numbers: 3
     */
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        int countEven = 0;
        int countOdd = 0;

        for (int index = 0; index < intArray.length; index++) {
            if (index % 2 == 0){
                countEven++;
            } else{
                countOdd++;
            }
        }
        System.out.println("Number of Even number is:" + countEven);
        System.out.println("Number of Even number is:" + countOdd);
    }
}
