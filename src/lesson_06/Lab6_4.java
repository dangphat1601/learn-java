package lesson_06;

import java.util.Arrays;

public class Lab6_4 {
    public static void main(String[] args) {

        /* LAB 6.4
         * String url = "https://google.com";
         * Check http OR https; domain name, .com OR .net
         * */

        String url = "https://google.com";
        String[] splitMethod = url.split(":");
        String[] splitDomain = url.split("\\.");
        String method = splitMethod[0];
        String domain = splitDomain[splitDomain.length-1];

        // System.out.println(method);
        // System.out.println(domain);

        // Check method http or https
        if (method.contains("s")) {
            System.out.println("This is method: " + method);
        } else {
            System.out.println("This is method: " + method);
        }

        // Check domain .com or .new
        if (domain.contains("com")){
            System.out.println("This is domain: ." + domain);
        } else {
            System.out.println("This is domain: ." + domain);
        }


    }
}
