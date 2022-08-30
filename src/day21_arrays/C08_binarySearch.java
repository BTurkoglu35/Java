package day21_arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

      /*
      Binary search java da eleman armaanin kisa yoludur
      Ancak binary searc'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir
       */

        String[] harfler={"Y","B","D","G","O","B"};

        String arananHarf="B";


        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(  C03_Contains.contains(harfler,arananHarf));


      //binary search bize aradigimix elemanin indexini dondurur

     //Array sirali olmadigi icin arama sonucunu dogru bukmayabilr
        //emin olmak icin sort yapmaliyiz

     Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));



    }
}
