package lmsSorular;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        /*
        Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tamsayı girmesini isteyin. Örnek: eğer kullanıcı
43 girilirse çıktı "43 bir asal sayıdır" olacaktır, kullanıcı 120 girerse çıktı "120 bir asal sayı değildir" olacaktır.
asal sayı", eğer kullanıcı negatif tamsayı girerse çıktı "Pozitif bir tamsayı girin" olacaktır.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();
        int sayac=0;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sayac++;
            }

        }if (sayac==0){
            System.out.println("sayi asalidr");
        }else System.out.println("asal degildir");















    }
}
