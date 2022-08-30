package lmsSorular.lmsSorularSetMap;

import java.util.HashMap;
import java.util.Map;

public class MapS02 {
    public static void main(String[] args) {
        /*
        Anahtar olarak ürün adlarını ve değer olarak ürün sayısını içeren bir Harita vardır.
Ürünler arasında 'Laptop' olup olmadığını kontrol etmek için kod yazın
         */


        Map<String,Integer> liste=new HashMap<String,Integer>();

        liste.put("bilgisayar",2);
        liste.put("defter",5);
        liste.put(" kalem",10);
        liste.put("telefon",3);
        liste.put("canta",4);

        String arananEleman="bilgisayar";

      if (liste.containsKey(arananEleman)) {
          System.out.println("bilgisayar listede var");
      }else System.out.println("bilgisayar listede yokk");








    }
}
