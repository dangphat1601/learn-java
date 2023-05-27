package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLenghth = 5;
        int [] myInArray = new int[arrayLenghth];
//        myInArray[0] = 1;
//        myInArray[1] = 2;
//        myInArray[2] = 3;
//        myInArray[3] = 4;
//        myInArray[4] = 5;
//
//        for (int index = 0; index < arrayLenghth; index++){
//            System.out.printf("Element at the index %d has value %d\n", index, myInArray[index]);
//        }
       /* for (int index = 0; index < arrayLenghth; index++) {
            myInArray[index] = index+1;
        }

        myInArray[arrayLenghth-1] = 10;
        for (int index = 0; index < arrayLenghth; index++) {
            System.out.printf("Element at the %d has value %d\n", index, myInArray[index]);
        }*/

        //Enhanced for loop
        for (int arrayElement : myInArray) {
            System.out.println(arrayElement);
        }

    }
}
