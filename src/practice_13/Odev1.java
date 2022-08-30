package practice_13;

import java.util.Random;
import java.util.Scanner;

public class Odev1 {
    //  Kullanicidan toplanmak uzere sayilar isteyin
// sayi adedi 10'u gecerse veya toplam 500 'u gecerse
// bu kadar sayi yeter
// ".. adet sayi girdin, toplami..." yazdirin


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int toplam=0;

        while (sayac<10 &&toplam<500){

            System.out.println("bir sayi giriniz");
            int sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(sayac+ " adet sayi girdiniz,toplami "+toplam);

    }










}
