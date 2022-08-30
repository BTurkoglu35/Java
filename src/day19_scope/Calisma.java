package day19_scope;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
       // Üç sayıyı kabul eden ve üç sayı da eşitse "Bütün sayılar eşittir", üç sayı da farklıysa "Bütün sayılar farklıdır",
       //değilse "Ne hepsi eşit ne de farklı" yazdıran bir Java programı yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("lutfen 3. sayiyi giriniz");
        int sayi3=scan.nextInt();


        if (sayi1==sayi2 && sayi3==sayi1) {
            System.out.println("Bütün sayılar eşittir");

        } else if (sayi1!=sayi2 && sayi3!=sayi1) {
            System.out.println("Bütün sayılar farklıdır");

        }else  {
            System.out.println("Ne hepsi eşit ne de farklı");
        }

    }
}
