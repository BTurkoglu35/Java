package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class Calisma04_List {
    public static void main(String[] args) {
     //   Bir tamsayı listesindeki tüm liste öğelerinin toplamını bulun
               
             List<Integer> sayilar=new ArrayList<Integer>();
             sayilar.add(2);
             sayilar.add(5);
             sayilar.add(10);
             sayilar.add(20);
             sayilar.add(35);

        System.out.println(sayilar);
           int toplam=0;
        for (int each:sayilar
             ) {
                        toplam+=each;
        }
        System.out.println(toplam);










    }
}
