package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        /*
        list primitive data turlerini kabl etmez

         */
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);//[5,3,7]

        //sadece add() kullanirsak java sone ekler

        sayilar.add(2,10);//indexi 2 olan yere 10 elementini ekleyelim

        System.out.println(sayilar);//[5,3,10,7]
        //add(index,element) istedigimiz indexe istedgimiz elemnti yerlestirir
        //add metodu eski elmentleri silmez veya update etmez yeni element ekler










    }
}
