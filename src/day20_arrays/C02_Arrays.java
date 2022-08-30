package day20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];
        System.out.println(sayilar);
    //non primitive data turlerindeki datalari her zaman direk yazdiramayabiliriz.
    //array'i yazdirmak istersek Arrays classtan yardim aliriz
        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));
      String siniList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(siniList));
        siniList[1]="Hasan";
        System.out.println(Arrays.toString(siniList));

        System.out.println(siniList[1]); //hasan'i yazdiralim
        System.out.println(siniList[0]);//ali
    }
}
