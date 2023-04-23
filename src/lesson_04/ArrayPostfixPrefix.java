package lesson_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;
        int [] myArray = new int[5];

        for (int index = 0; index < 5; index++) {
            myArray[index] = index + 1;
        }
        for (int value : myArray) {
            System.out.println(value);
        }
    }
}
