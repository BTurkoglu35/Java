package day29_passByValue;

import java.util.Locale;

public class C05_Inmutable {
    public static void main(String[] args) {

       String isim="mine";
       isim=isim.toUpperCase();
        System.out.println(isim);//MINE

        isim="mevlut";
       for (int i = 0; i <100 ; i++) {
           isim+=".";
       }System.out.println(isim);




    }
}
