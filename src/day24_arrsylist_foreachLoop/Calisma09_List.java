package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calisma09_List {
    public static <list> void main(String[] args) {
        //    Bir Tamsayı Listesinde en yakın 2 tamsayıyı bulun
        //    Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(12);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(33);
        sayilar.add(54);

        Collections.sort(sayilar);//[12, 15, 31, 33, 54]
       int minFark=sayilar.get(2)-sayilar.get(1);

        for (int i = 1; i <sayilar.size(); i++) {
            minFark=Math.min(minFark,sayilar.get(i)-sayilar.get(i-1));

        }
        System.out.println(minFark);

        for (int i = 1; i < sayilar.size(); i++) {
            if(sayilar.get(i)-sayilar.get(i-1)==minFark){
                System.out.println(sayilar.get(i)+" and "+sayilar.get(i-1));
            }

        }



    }
}