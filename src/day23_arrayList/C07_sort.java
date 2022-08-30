package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        Collections.sort(urunler);
        System.out.println(urunler);//[cay, cekirdek, ikram, nutella]

         /*
         List ile gelen sort methodunda siralama ozellegini girmek gerekiyor
         bunun yerine collections class'indan sort methodunu kullaniyoruz
         bu method listemizi natural order'a gore siralar
          */

        //***Önemli*** System.out.println( Collections.sort(list)); -->şeklinde metod print içinde çalışmaz





    }
}
