package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'i array yapan sembol [] idi
        arraylist de ise <> diamond kullaniriz
         */

        List<String>isimler=new ArrayList<>();
        System.out.println(isimler);// []

        //bir liste eleman eklemek istersek
        isimler.add("Basak");

        System.out.println(isimler.add("Ayse"));//true doner

        /*
        String de bir method calistirdgimizda assign yapmazsak String degismiyordu

        String isim="Suleyman
        isim.toUpperCase();//SULEYMAN
        sout(isim) ==> Suleyman
         */


        System.out.println(isimler);//[Basak,Ayse]

        /*
        list'in tek kotu tarafi array alt yapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir
         */













    }
}
