package day30_inmutable;

import java.time.LocalTime;

public class C05_StringVsStringBuilder { public static void main(String[] args) {
        /*
          String mi yoksa StringBuilder mi daha hizlidir ?
          bunun için bir String olusturup, 1000 kere araç . ekleyelim
          oncesinde ve sonrasinda zamani alip
          aradaki farki bulalim

          ayni islemi ip ustası için de yapalim
         */

    LocalTime baslangic=LocalTime.now();

    String str="Ahhh Java";
    for (int i = 0; i <10000 ; i++) {
        str+=".";
    }

    LocalTime bitis=LocalTime.now();

    System.out.println(baslangic);
    System.out.println(bitis);

    System.out.println("String zaman : "+ (bitis.getNano()-baslangic.getNano()));


    baslangic=LocalTime.now();

    StringBuilder sb=new StringBuilder("Ahhh Java");
    for (int i = 0; i <10000 ; i++) {
        sb.append(".");
    }

    bitis=LocalTime.now();

    System.out.println(baslangic);
    System.out.println(bitis);

    System.out.println("String Builder zaman : "+ (bitis.getNano()-baslangic.getNano()));

}
}
