package lesson_05;

import java.util.*;

public class RemovingDuplicateValues {
    public static void main(String[] args) {
        List<Integer> myArrList= new ArrayList<>();
        myArrList.add(1);
        myArrList.add(7);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(2);
        myArrList.add(3);

        /*
        * Lay 3 gia tri nho nhat cua myArrayList khong trung nhau
        *
        * */
        List<Integer> withoutDuplicateValuesList = new ArrayList<>();
        for (Integer number : myArrList) {
            if(!withoutDuplicateValuesList.contains(number)){
                withoutDuplicateValuesList.add(number);
            }
        }

        System.out.println(myArrList);
        Collections.sort(withoutDuplicateValuesList);
        System.out.println(withoutDuplicateValuesList);

        // Set
        /*Set<Integer> set = new HashSet<>(myArrList);
        myArrList = new ArrayList<>(set);
        System.out.println(myArrList);*/

        //Sublist
        List<Integer> first3mValues= withoutDuplicateValuesList.subList(0, 3); //Exclusive
        System.out.println(first3mValues);
    }
}
