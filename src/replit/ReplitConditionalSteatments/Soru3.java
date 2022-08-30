package replit.ReplitConditionalSteatments;

import java.util.Scanner;

public class Soru3 {
    //Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("3.sayiyi giriniz");
        int sayi3=scan.nextInt();

        if (sayi1>sayi3&&sayi1>sayi2){
            System.out.println("en buyuk sayi = "+sayi1);
        }else if (sayi2>sayi1&&sayi2>sayi3){
            System.out.println("en buyuk sayi = "+sayi2);
        } else if (sayi3>sayi1&&sayi3>sayi2) {
            System.out.println("en buyuk sayi = "+sayi3);

        }


    }
}
