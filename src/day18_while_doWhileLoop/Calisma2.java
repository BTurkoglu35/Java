package day18_while_doWhileLoop;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {

//kulllanicidan bir sayi alin ve bu sayinin tam bolenlerinin sayilari ve toplam kac
// tane oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
         int sayi=scan.nextInt();

        int tamBolenlerinTop = 0;
        int tamBolenlerinSayisi = 0;
        int baslangic =1;
        while (baslangic<sayi) {


            if (sayi%baslangic==0){
               tamBolenlerinTop+=baslangic;
               tamBolenlerinSayisi++;

            }
          baslangic++;

        }
        System.out.println(tamBolenlerinSayisi);
        System.out.println(tamBolenlerinTop
        );
    }
}