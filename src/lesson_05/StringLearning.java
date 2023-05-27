package lesson_05;

public class StringLearning {
    public static void main(String[] args) {
        String myName1 = "Phat"; // Litenal declaration
        String myName2 = "Phat";
        String myName3 = new String("Phat"); // Via String object

        System.out.println("myname 1 == myName 2:" + (myName1.equals(myName2)));
        System.out.println("myname 1 == myName 2:" + (myName1.equals(myName3)));

        // Check lower case, uppercase, digit...

        String myPassword = "123myPassword";
        char[] myCharacter = myPassword.toCharArray();
        int totalDigits = 0;
        int totalUpperCases = 0;
        int totalLowerCase= 0 ;

        for (char character : myCharacter) {
            if(Character.isDigit(character)) totalDigits++;
            else if(Character.isUpperCase(character)) totalUpperCases++;
            else if (Character.isLowerCase(character)) totalLowerCase++;

        }

        if(totalDigits > 0 && totalUpperCases > 0 && totalLowerCase > 0){
            System.out.println("You are all set.");
        } else {
            System.out.println("Password format is wrong!");
        }

        // Replacement | Immutable
        String badWordContainer = " bad, very bad, sth else, bad ";
        String filteredStr = badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        System.out.println(filteredStr);
    }
}
