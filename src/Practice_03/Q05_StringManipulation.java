package Practice_03;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve
        // hangisinin daha uzun oldugunu yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("adinizi ve soyismini yaziniz:");
        String ad=scan.nextLine();
        String soyad=scan.nextLine();
       int adUzunluk =ad.length();
       int soyadUzunluk=soyad.length();
       if (adUzunluk> soyadUzunluk) {
           System.out.println("isminiz daha uzun");}
       else if (soyadUzunluk>adUzunluk) {
           System.out.println("soyisminiz daha uzun");

       }else System.out.println("isminiz ve soyisminiz esit");


    }
}
