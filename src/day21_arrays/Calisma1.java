package day21_arrays;

public class Calisma1 {
    public static void main(String[] args) {
        /*
        Bir tamsayı dizisinde ortadaki elemanı bulun
        Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı=8
         (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıkış=(8+12)/2 = 10
         */

        int[] sayilar = {10, 4,6,7};
        int uzunluk = sayilar.length;
        int ort = (sayilar.length) / 2;


        if (uzunluk % 2 != 0) {
            System.out.println(sayilar[(sayilar.length) / 2]);
        } else
            System.out.println((sayilar[ort] + sayilar[ort - 1]) / 2);

    }
}

















