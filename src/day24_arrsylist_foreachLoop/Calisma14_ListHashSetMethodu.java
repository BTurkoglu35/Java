package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Calisma14_ListHashSetMethodu {
    public static void main(String[] args) {

        // Bir listede kaç farklı öğe olduğunu gösteren kodu yazın.  Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
        // Type the code that shows how many different elements there are in a list. Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(12);
        myList.add(4);
        myList.add(4);
        myList.add(12);
        myList.add(4);

       HashSet<Integer> differntElements = new HashSet<>(myList);
        System.out.println(differntElements.size());













    }
}
