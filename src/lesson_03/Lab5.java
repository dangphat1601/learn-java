package lesson_03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab5 {
    /*   LAB 3.5
       ===Sort an integer array from min to max===
       Input: {12, 34, 1, 16, 28}
       Expected output: {1, 12, 16, 28, 34}
    */
    public static void main(String[] args) {
        int [] intArray = {12, 34, 1, 16, 28};
        Arrays.sort(intArray);
        System.out.println("Sort an integer array from min to max: " + Arrays.toString(intArray));
    }
}
