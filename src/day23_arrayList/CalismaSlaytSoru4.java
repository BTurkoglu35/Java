package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalismaSlaytSoru4 {
    public static void main(String[] args) {

        // verilen bir array'de istenmeyen harf iceren kelimelri silip ,kalan elemntleri yeni bir aary yapin

        String[] kelimeler = {"derya", "ali", "mert", "enes", "asu"};
        String istenmeyen = "a";

        List<String> isimler = new ArrayList<String>();
        for (int i = 0; i < kelimeler.length; i++) {
            isimler.add(kelimeler[i]);
        }

        List<String> silinmeyecekKelimeler = new ArrayList<String>();
        for (int i = 0; i < isimler.size(); i++) {
            if (!isimler.get(i).contains(istenmeyen)) {
                silinmeyecekKelimeler.add(isimler.get(i));
            }
        }

        String[] icermeyenler = new String[silinmeyecekKelimeler.size()];
        for (int i = 0; i < silinmeyecekKelimeler.size(); i++) {
            icermeyenler[i] = silinmeyecekKelimeler.get(i);

        }
        System.out.println(Arrays.toString(icermeyenler));


    }
}
