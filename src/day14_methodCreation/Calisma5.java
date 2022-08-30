package day14_methodCreation;

import java.util.Scanner;

public class Calisma5 {
    public static void main(String[] args) {
  // kullanicidan uc sayi isteyin kuz=cukten buyuge siralayin
      Scanner scan=new Scanner(System.in);
        System.out.println("sayi1 giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("sayi1 giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("sayi1 giriniz");
        double sayi3= scan.nextDouble();


     double sayiKucuk= sayiKucuk(sayi1, sayi2, sayi3);
        System.out.println("sayi kucuk" +sayiKucuk(sayi1, sayi2, sayi3));


    }

    private static double sayiKucuk(double sayi1, double sayi2, double sayi3) {
        return Math.min(Math.min(sayi1,sayi2),sayi3);
    }


}
