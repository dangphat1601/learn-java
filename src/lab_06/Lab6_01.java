package lab_06;

public class Lab6_01 {
    public static void main(String[] args) {

        /*   LAB 6.1
        *   Given input string: "2hrs and 5 minutes"
        *   Please calculate how many minutes in total
        * */

        String input = "2hrs and 5 minutes";
        String[] splitInput = input.split(" and ");
        //System.out.println(Arrays.toString(splitInput));

        if (splitInput.length >= 2) {
            String hourStr = splitInput[0];
            String minStr = splitInput[1];
            String splitHours = hourStr.replaceAll("[^\\d]+", "");
            String splitMins = minStr.replaceAll("[^\\d]+", "");

            // System.out.println(splitHours);
            // System.out.println(splitMins);

            int hours = Integer.valueOf(splitHours);
            int mins = Integer.valueOf(splitMins);
            // System.out.println(hours);
            // System.out.println(mins);
            int totalMinutes = (hours * 60) + mins;
            System.out.println("Total minutes: " + totalMinutes);
        }


    }
}
