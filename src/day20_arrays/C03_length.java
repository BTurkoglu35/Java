package day20_arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {
        //iki sekilde Arrays olusturulabiliriz
        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayilar Arrays'in uzunlugu: "+sayilar.length);
    //Strinng length() methodunda parantez var, array'de yok.
        System.out.println("harfler array'inin uzunlugu: "+harfler.length);
        System.out.println(Arrays.toString(harfler));// null,null,null,null

        //harfler array'in son elemanini yazdiralim
        System.out.println(harfler[harfler.length - 1]);
        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException




    }
}
