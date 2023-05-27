package lesson_05;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        /*String myName1 = "Phat"; // Litenal declaration
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
        String badWordContainer = "   bad, very bad, sth else, bad ";
        String filteredStr = badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        System.out.println(filteredStr);

        // Trim
        System.out.println(badWordContainer);
        System.out.println(badWordContainer.trim());
*/
        // Substring, indexOf, split
        String url = "https://google.com@";
        /*System.out.println(url.length());
        System.out.println(url.indexOf("o"));
        System.out.println(url.indexOf("com"));
        System.out.println(url.indexOf("https_"));
        System.out.println(url.indexOf("@"));

        System.out.println(url.substring(0, 3));
        System.out.println(url.substring(2));*/

       // String[] splitStr = url.split("://");
        String[] splitStr = url.split("");
        System.out.println(Arrays.toString(splitStr));

        // Regex | Regular Expression
        String myCookingTimes = "  105 mins    ";
        // TODO: Pattern and Matcher

        String cookingTimeNumberStr = myCookingTimes.replaceAll("[^0-9]","");
        System.out.println(cookingTimeNumberStr); // chữ số

        //System.out.println(Integer.valueOf(cookingTimeNumberStr)); // con số
        int cookingTime = Integer.valueOf(cookingTimeNumberStr);

        System.out.println("Cooking time is: " + (cookingTime + 1));

        // Concaternation
        String s1 = "Hello, ";
        String s2 = "Phat";
        System.out.println(s1.concat(s2));
        System.out.println((s1 + s2));

        // StringBuilder
    }
}
