package day03_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanicidan ismini isteyin.Girilen ismi ismiiz;.... seklinde yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriiniz:");
        String isim=scan.next();
        System.out.println("girdiginiz isim:"+isim);

        //kullanicidan yas girmesini isteyin
        Scanner scan1=new Scanner(System.in);
        System.out.println("yasinizi giriniz:");
        int yas=scan1.nextInt();
        System.out.println("girdiginiz yas" +yas);

        //kullanicidan aldigin iki sayiyi toplayin
        Scanner scan2=new Scanner(System.in);
        System.out.println("say1 gir" +"say2 gir");
        double say1=scan.nextDouble();
        double say2=scan.nextDouble();



    }
}
