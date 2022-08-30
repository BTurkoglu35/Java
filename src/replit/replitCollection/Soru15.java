package replit.replitCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class Soru15 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
         */


        TreeSet<String> liste=new TreeSet<>();
        liste.add("yesil");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("sari");
        liste.add("turuncu");
        liste.add("pembe");

        System.out.println("tree ilk eleman" +liste.first());
        System.out.println("tree son eleman" +liste.last());





    }
}
