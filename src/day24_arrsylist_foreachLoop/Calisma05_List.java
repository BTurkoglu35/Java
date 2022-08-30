package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class Calisma05_List {
    public static void main(String[] args) {
       // Bir tamsayı listesinde 13'ün ilk oluşumundan önceki tüm liste öğelerinin toplamını bulun
        List<Integer> sayilar=new ArrayList<Integer>();
        sayilar.add(10);
        sayilar.add(11);
        sayilar.add(13);
        sayilar.add(14);
        sayilar.add(15);
        sayilar.add(16);
        sayilar.add(17);
 int toplam=0;

        for (int i =0 ;i <=sayilar.indexOf(13); i++){
          toplam += sayilar.get(i);

        }
        System.out.println(toplam);












    }
}
