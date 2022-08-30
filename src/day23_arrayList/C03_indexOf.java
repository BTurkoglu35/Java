package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


       //indexOf  (int doner)
        System.out.println(urunler.indexOf("ikram"));//1
        /*
        indexof methodu bize bilgi donduren bir methoddur
        listemizi degistirmez
         */

        //last indexof

        System.out.println(urunler.lastIndexOf("ikram"));//1

        /*
        indexOf methodu aramaya sifirinci indexten
        lastindexof methodu armaya son indexten baslar

        arama bitip urun bulundugunda, ikiside bulunan urunun index'ini verir
         */
        urunler.add("ikram");
        System.out.println(urunler);//[nutella, ikram, cekirdek, cay, ikram]

        System.out.println(urunler.indexOf("ikram"));//1
        System.out.println(urunler.lastIndexOf("ikram"));//4

        System.out.println(urunler.indexOf("hobby"));//-1
        System.out.println(urunler.lastIndexOf("hobby"));//-1








    }
}
