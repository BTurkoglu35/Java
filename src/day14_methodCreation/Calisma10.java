package day14_methodCreation;

import java.util.Scanner;

public class Calisma10 {
    public static void main(String[] args) {
        /*Kullanıcıdan alfabeden tek bir karakter sağlayan bir Java programı yazınız.
         Kullanıcı girişine bağlı olarak Sesli Harf veya Ünsüz Yazdır.
         Kullanıcı girişi bir harf değilse (a ile z veya A ile Z arasında) veya > 1 uzunluğunda bir dize ise,
         bir hata mesajı yazdırın. editöre git
         */

        /*Test Verileri
        Bir alfabe girin: p
        Beklenen Çıktı :
        Girilen harf Ünsüzdür*/

        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        char harf = scan.next().toUpperCase().charAt(0);


        unluMuUnsuzMu(harf);
    }

    private static void unluMuUnsuzMu(char harf) {

        if (!((harf >= 'A' && harf <= 'Z') || (harf >= 'a' && harf <= 'z'))) {
            System.out.println("hatali giris");
        } else if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u'
        || harf == 'A' || harf == 'E' || harf == 'I' || harf == 'O' || harf == 'U' ) {
            System.out.println("sesli harf");
        } else System.out.println("unsuz harf");
    }
}