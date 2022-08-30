package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class Calisma11_List {
    public static void main(String[] args) {
     //   Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırın
     //   Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

      List<Integer> sayilar= new ArrayList<Integer>();
      sayilar.add(12);
      sayilar.add(31);
      sayilar.add(7);
      sayilar.add(13);
      sayilar.add(10);
        System.out.println(sayilar);

        for (int aech:sayilar
             ) {
            if (aech == 7 || aech == 10) {
                continue;
            } else {
                sayilar.set(sayilar.indexOf(
                        aech), aech + 2);
            }
        }  System.out.println(sayilar);


















        }
}
