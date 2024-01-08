package lab_04;

import java.util.*;


public class Lab4 {
    public static void main(String[] args) {
        List<Integer> numeberList = new ArrayList<>();

        // Add number to the numberList
        numeberList.add(1);
        numeberList.add(2);
        numeberList.add(3);
        numeberList.add(4);
        numeberList.add(5);

        // Printing the number
        System.out.println("Numbers in the list" + numeberList);

        // Getting the maximum number
        // Cach 1: sort giam dan & lay phan tu dau tien: => dung HashSet
        Set<Integer> setNumberList = new HashSet<>(numeberList);
        numeberList = new ArrayList<>(setNumberList);
        System.out.println(numeberList);

        List<Integer> getMinNumber = new ArrayList<>(setNumberList);
        System.out.println("Min number: " + getMinNumber.get(0));

       // System.out.println("Max number: " + getMinNumber.get[length-1);

        System.out.println("Max number: " + getMinNumber.get(4));

        // Cach 2: Duyet qua tung phan tu & so sanh tung phan tu voi so lon nhat hien tai:




    }
}
