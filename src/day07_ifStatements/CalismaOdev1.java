package day07_ifStatements;

import java.util.Scanner;

public class CalismaOdev1 {
    public static void main(String[] args) {
      /*
       IF CUMLELERI
       soru1
      Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0) {
            System.out.println("sayi cift");
        }else {
            System.out.println("sayi tek");
        } */

        // soru2
         Scanner scan = new Scanner(System.in);
        System.out.println("gun isimlerinden birinin ilk harfinni giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'P') {
            System.out.println("pazartesi, persembe,pazar");
        }
            if (ilkHarf == 'S') {
                System.out.println("sali");
            }
             if (ilkHarf == 'C') {
                System.out.println("cuma;cumartesi,carsamba");

            }


        /* soru4
         Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kenar uzunkuklarini girniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();

        if (kenar1==kenar2)
        {
            System.out.println("dikdortgen karedir");
        }
        else {
            System.out.println("dikdortgen kare degildir");
        }
         */

        /*soru5
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun girniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("cuma"))
        {
            System.out.println("muslumanlar icin kutsal gun");

        }
        if (gunIsmi.equals("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }
        if (gunIsmi.equals("pazar")){
            System.out.println("hristiyanlar icin kutsal gun");
        }  */


    }
}
