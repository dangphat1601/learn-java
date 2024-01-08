package lab_03;

public class Lab3_02 {
    /*   LAB 3.2
     === Finding maximum value/minimum value from an integer array ===
            int[] intArr = {1, 2, 3, 4, 5};
            Minimum: 1
            Maximum: 5
     */
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        int max = intArray [0];
        int min = intArray [0];

        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] < min){
                min = intArray[index];
            } if (intArray[index] > max) {
                max = intArray[index];
            }
        }

        System.out.println("Max is:" + max);
        System.out.println("Min is:" + min);
    }
}
