package day14_methodCreation;

import java.util.Scanner;

public class Calisma3 {
    public static void main(String[] args) {


 /*
        Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
        Kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve
        sayilarin toplamini yazdirin.
        Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse
        "Cok sayi girdiniz, ben toplayamam" yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kac sayi toplamak istedeiginiz yazin");
        int sayiAdedi = scan.nextInt();

        sayiAdediAl(sayiAdedi);


    }

    private static void sayiAdediAl(int sayiAdedi) {
        if (sayiAdedi>4) {
            System.out.println("\"Cok sayi girdiniz, ben toplayamam\"");


        } else if (sayiAdedi == 2 || sayiAdedi == 3 || sayiAdedi == 4) {


            }  if (sayiAdedi == 2) {
                Scanner scan = new Scanner(System.in);
                System.out.println("lutfen sayi1 giriniz");
                int sayi1 = scan.nextInt();
                System.out.println("lutfen sayi2 girin");
                int sayi2 = scan.nextInt();
                int toplam = sayi1 + sayi2;
                System.out.println("toplam = " + toplam);

            } else if (sayiAdedi == 3) {
                Scanner scan = new Scanner(System.in);
                System.out.println("lutfen sayi1 giriniz");
                int sayi1 = scan.nextInt();
                System.out.println("lutfen sayi2 girin");
                int sayi2 = scan.nextInt();
                System.out.println("lutfen sayi3 girin");
                int sayi3 = scan.nextInt();
                int toplam = sayi1 + sayi2 + sayi3;
                System.out.println("toplam = " + toplam);

            } else if (sayiAdedi == 4) {
                Scanner scan = new Scanner(System.in);
                System.out.println("lutfen sayi1 giriniz");
                int sayi1 = scan.nextInt();
                System.out.println("lutfen sayi2 girin");
                int sayi2 = scan.nextInt();
                System.out.println("lutfen sayi3 girin");
                int sayi3 = scan.nextInt();
                System.out.println("lutfen sayi4 girin");
                int sayi4 = scan.nextInt();
                int toplam = sayi1 + sayi2 + sayi3 + sayi4;
            System.out.println("toplam = " + toplam);

            }
        }


    }
