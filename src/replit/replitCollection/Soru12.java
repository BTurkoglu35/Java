package replit.replitCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Soru12 {
    public static void main(String[] args) {
        /*
        Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.

HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
         */

        HashSet<String> list= new HashSet<String>();
        list.add("sari");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("turuncu");

        Set<String> set= new TreeSet<>();
        set.addAll(list);
        for (String each:set
             ) {
            System.out.println(each);
        }
    }
}
