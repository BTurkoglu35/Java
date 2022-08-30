package replit.replitCollection;

import java.util.Set;
import java.util.TreeSet;

public class Soru13 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

         */

        TreeSet<String> liste=new TreeSet<>();
        liste.add("yesil");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("sari");
        liste.add("beyaz");
        liste.add("siyah");

        for (String each:liste
             ) {
            System.out.println(each);
        }






    }
}
