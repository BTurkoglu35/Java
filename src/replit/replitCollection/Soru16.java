package replit.replitCollection;

import java.util.TreeSet;

public class Soru16 {
    public static void main(String[] args) {
        /*Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe*/

        TreeSet<String> liste=new TreeSet<>();
        liste.add("yesil");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("sari");
        liste.add("pembe");

        int sayac=0;
        for (String each:liste
             ) {
            sayac++;
        }

        System.out.println("treeset eleman sayisi "+sayac);
    }
}
