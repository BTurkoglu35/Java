package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        //Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,13,56,23,45,14,40));

        //sondan basa dogru yazdirmak icin once sona gitmeliyiz

        ListIterator list1=list.listIterator();
        System.out.println(list);

        while (list1.hasNext()) {
            list1.next();
        }
        //bu loop bizi sona goturur
        while (list1.hasPrevious()) {
            System.out.print(list1.previous()+" ");
        }
        System.out.println(list);











    }
}
