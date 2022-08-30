package day21_arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() bir array methodu degil strining methodudur
        ama array dondurdugu icin bu konuda anlatiyoruz

        Split ile herhangi bir stringi istedigimiz sekilde parcalra bolup bir array
       haline getiriyoruz

         */


        String str="Java, ne guzel";
        String[]kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Java,, ne, guzel]



        String[]kelimelerNe=str.split("ne ");
        System.out.println(Arrays.toString(kelimelerNe));//[Java, , guzel]

        String[]kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE));//[Java, n,  guz, l]

        String[]karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));//[J, a, v, a, ,,  , n, e,  , g, u, z, e, l]

















    }
}
