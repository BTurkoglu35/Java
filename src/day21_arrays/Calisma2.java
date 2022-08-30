package day21_arrays;

import java.util.Arrays;

public class Calisma2 {
    public static void main(String[] args) {
            /*
        Bir tamsayı dizisindeki en küçük pozitif elemanı ve en büyük negatif elemanı bulun
        Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2 */


        int[] sayilar = {12, -4, 9, -12 - 6};
       Arrays.sort(sayilar);//{-12,-6,-4,9,12}

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < 0 && sayilar[i + 1] > 0) {
                System.out.println("max negatif tamsayi" + sayilar[i]);
                System.out.println("min pozitif tamsayi" + sayilar[i + 1]);


            }


        }


    }}


