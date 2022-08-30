package replit.replitCollection;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Soru11 {
    public static void main(String[] args) {
        /*
        HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.

HashSet List: sari,mavi,kirmizi,yesil,mor

         */
        HashSet<String> list= new HashSet<String>();
        list.add("sari");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");

        TreeSet<String> set= new TreeSet<String>();
        set.addAll(list);
        System.out.println(set);
    }
}
