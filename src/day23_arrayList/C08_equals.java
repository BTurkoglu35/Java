package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        List<String> urunler2=new ArrayList<String>();
        urunler2.add("ikram");
        urunler2.add("nutella");
        urunler2.add("cay");
        urunler2.add("cekirdek");
        System.out.println(urunler.equals(urunler2));//false

        Collections.sort(urunler);
        System.out.println(urunler);//[cay, cekirdek, ikram, nutella]

        Collections.sort(urunler2);
        System.out.println(urunler2);//[cay, cekirdek, ikram, nutella]

        System.out.println(urunler.equals(urunler2));//true






    }
}
