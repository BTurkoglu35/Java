package lmsSorular.lmsSorularSetMap;

import java.util.*;

public class MapS03 {
    public static void main(String[] args) {
        /*
            Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita vardır.
           Ürün adlarını alfabetik sırayla yazdırın
           Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita vardır
      */
        Map<String,Integer> liste=new HashMap<String,Integer>();

        liste.put("bilgisayar",2);
        liste.put("defter",5);
        liste.put("kalem",10);
        liste.put("telefon",3);
        liste.put("canta",4);

        Set<String> set = new TreeSet<>();
        set.addAll(liste.keySet());
        System.out.println(set);
    }
}
