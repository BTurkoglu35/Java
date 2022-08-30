package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.
       /* Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0?sayi:(-1*sayi));*/

        /*Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
         negatifse  sayinin karesini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        // eger ternary icindeki sonuclar farkli data turundeyse atama yapamayiz sadece
        //yazdirabiliriz
        System.out.println(sayi>0?"sayi pozitif":(sayi*sayi));
    }

}
