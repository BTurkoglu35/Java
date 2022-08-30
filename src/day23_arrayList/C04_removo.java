package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_removo {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

  /*
  removo methodu iki sekilde kullanlir
  1- objeyi yazip ,silmesini istersek bize boolean sonuc doner
  2-index girersek o index'deki elemani siler ve bize o elemani dondurur
   */

        System.out.println(urunler);//[nutella, ikram, cekirdek, cay]
        System.out.println(urunler.remove("ikram"));//true
        System.out.println(urunler);//[nutella, cekirdek, cay]

        System.out.println(urunler.remove("hobby"));//false
        System.out.println(urunler);//[nutella, cekirdek, cay]

        // ikinci yontemi deneyelim yani index girelim

        System.out.println(urunler.remove(1));//cekirdek
        System.out.println(urunler);//[nutella, cay]

     //olmayan bir indexi silmeye calisirsak ?
     //   System.out.println(urunler.remove(3));// IndexOutOfBoundsException










    }
}
