package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class odev {
    public static void main(String[] args) {
        /*
        Soru 5) (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
 Orn :  list : [2,13,56,23,45,14,40]
 artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]
         */
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,13,56,23,45,14,40));
        ListIterator list1=list.listIterator();
        Integer x;

        while (list1.hasNext()){
            x=(Integer)list1.next()+5;
            list1.set(x);

        }
        System.out.println(list);


    }
}
