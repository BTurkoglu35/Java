package day08_ifStatements;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {


        //Scanner scan= new Scanner(System.in);
        //System.out.println("lutfen bir gun giriniz");
        //String gun=scan.next().toLowerCase();

        //if (gun.equals("pazartesi")) {
        //    System.out.println("Paz");
        //} else if (gun.equals("sali")) {
        //    System.out.println("Sal");
        //    } else if (gun.equals("carsamba")) {
        //    System.out.println("Car");
        //    } else if (gun.equals("persembe")) {
        //    System.out.println("Per");
        //    } else if (gun.equals("cuma")) {
        //    System.out.println("Cum");
        //    } else if (gun.equals("cumartesi")) {
        //    System.out.println("Cum");
        //    }else if (gun.equals("pazar")) {
        //    System.out.println("Paz");}
        //    else {System.out.println("lutfen gecerli bir gun giriniz");


        //Scanner scan= new Scanner(System.in);
        //  System.out.println("maas icin bir teklif veriniz");
        //  int maasTeklifi=scan.nextInt();
        //  
        //  if(maasTeklifi<60000){
        //  System.out.println("Malesef kabul edemem");} 
        //  else if (maasTeklifi<80000) 
        //  {System.out.println("Konusabiliriz");} 
        //  else if (maasTeklifi>80000) {
        //      System.out.println("kabul ediyorum");
        //  }


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double say1 = scan.nextDouble();
        double say2 = scan.nextDouble();
        if (say1 > 0 && say2 > 0) {
            System.out.println(say1 + say2);
        } else if (say1 < 0 && say2 < 0) {
            System.out.println(say1 * say2);
        } else if (say1 > 0 && say2 < 0 || say1 < 0 && say2 > 0) {

            System.out.println("farkli isaretlerde sayilarla islem yapamassin");
        }
        else if (say1==0  || say2 ==0)
        { System.out.println("sifir carpmaya gore yutan elemandir");}










    }


}

