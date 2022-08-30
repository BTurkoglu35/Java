package day16_forLoop;

import java.util.Scanner;

public class CalismaReplitDonguler2 {
    public static void main(String[] args) {
        // Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        //Input :
        //30
        //40
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2 = scan.nextInt();
        int ebob = 0;

        for (int i = 1; i<=sayi1; i++) {
            if (sayi1%i == 0 && sayi2%i == 0){
                    ebob = i;

            }
        }System.out.println("ebob = " + ebob);

        int ekok =(sayi1*sayi2)/ebob;
        System.out.println("ekok = " + ekok);




    }

}