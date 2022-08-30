package day05_variables;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
//kulllacidan dort basamklli bir sayi alin ve rakamlari toplaminii buluunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dort basamkli pozitif bir sayi giriniz");
        int sayi= scan.nextInt();//5267

        int birlerBas=0;
        int rakamlarTop=0;
         birlerBas=sayi%10;
         rakamlarTop+=birlerBas;
         sayi/=10;

         birlerBas=sayi%10;
         rakamlarTop+=birlerBas;
         sayi/=10;

         birlerBas=sayi%10;
         rakamlarTop+=birlerBas;
         sayi/=10;

         birlerBas=sayi%10;
         rakamlarTop+=birlerBas;
        sayi/=10;
        System.out.println("Sayinin rakamlar toplami"  +rakamlarTop);
    }
}
