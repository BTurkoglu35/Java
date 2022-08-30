package day21_arrays;

import java.util.Arrays;

public class Calisma10 {
    public static void main(String[] args) {
        /*
        Tüm sıfırları bir tamsayı dizisinde sona erdirmek için kodu yazın.
        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0
*/

        int[] sayilar={5,0,2,0,3};
        int [] yeniSayilar=new int[sayilar.length];
        int ilk=0;

        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]!=0){
             yeniSayilar[ilk]=sayilar[i];
             ilk++;
            }


        }
        System.out.println(Arrays.toString(yeniSayilar));




















    }
























}










