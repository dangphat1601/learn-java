package lab_06;

public class Lab6_03 {
    public static void main(String[] args) {

        /* LAB 6.3
         *   String myStr = "100 minutes";
         *    NOT using REGEX, extract digit character from that String
         *   Expected output: "100".
         *   EX: "12345nabc678" -> "12345678"
         * */

        String myStr = "100 minutes";
        String digitalNumbe = "";
        char[] newStr = myStr.toCharArray();
        System.out.println(newStr);
        for (char character : newStr) {
            if (Character.isDigit(character)) {
                digitalNumbe = digitalNumbe.concat(String.valueOf(character));
            }
        }
        System.out.println(digitalNumbe);
    }
}
