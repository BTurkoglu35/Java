package lmsSorular.lmsSorularSetMap;

import java.util.HashMap;
import java.util.Map;

public class MapS01 {
    public static void main(String[] args) {
        /*
        Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita vardır.
Toplam ürün sayısını bulmak için kodu yazın.

         */

        Map<String,Integer> liste=new HashMap<String,Integer>();

        liste.put("bilgiyar",2);
        liste.put("defter",5);
        liste.put(" kalem",10);
        liste.put("telefon",3);
        liste.put("canta",4);

         int urunSayisi=0;
        for (Integer eacch:liste.values()) {
            urunSayisi+=eacch;
        }
        System.out.println("urunSayisi = " + urunSayisi);






    }
}
