package day03_variables;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi alip
        bu sayilarin carpimini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("sayilarin carpimi:"+sayi1*sayi2);

    }


    }
