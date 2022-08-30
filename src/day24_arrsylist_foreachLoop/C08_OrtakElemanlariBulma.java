package day24_arrsylist_foreachLoop;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemanlariBulma {
    public static void main(String[] args) {
        /*
       soru 3:
         iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
         each loop
         kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
         */

       String[] arr1={"ali", "veli", "can","ayse"} ;
       String[] arr2={"ali", "hasan", "ayse","enes"} ;

        List<String> ortakIsimler=new ArrayList<String>();

        for (String each:arr1
             ) {
            for (String each2:arr2
                 ) {
                if (each.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each2);
                }
            }
        }
        if (ortakIsimler.isEmpty()){
            System.out.println("hic ortak eleman yok");
        }else  System.out.println("her iki arraydaki ortak isimler " +ortakIsimler);




















    }
}
