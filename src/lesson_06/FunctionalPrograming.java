package lesson_06;

//Template | Blueprint
public class FunctionalPrograming {

    // Method signature
    // Method overloading
    public int sum (int num1, int num2) {
        return num1 + num2;
    }

    /*public int sum (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }*/

    // Varagrs | Rest Parameters
    public int sum (int... restNumbers) {
        int arrTotal = 0;
        for (int number : restNumbers) {
            arrTotal = arrTotal + number;
        }
        return arrTotal;
    }
    //Note:
    // WHEN over loading happens | Compile time
    // WHEN overriding happens | Run time

    public static void main(String[] args) {
        FunctionalPrograming functionalPrograming = new FunctionalPrograming();
        functionalPrograming.sum(1, 2);
        System.out.println(functionalPrograming.sum(1, 2, 3, 4, 5, 6, 7));
    }
}
