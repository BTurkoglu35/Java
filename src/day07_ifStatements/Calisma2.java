package day07_ifStatements;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {


        // Scanner scan = new Scanner(System.in);
        // System.out.println("kenar uzunluklarini giriniz");
        // double kenar1=scan.nextDouble();
        // double kenar2=scan.nextDouble();
//
        // if (kenar1==kenar2) {System.out.println("dikdortgen karedir");}
//
        // else {System.out.println("dikdortgen karedegildir");}
//

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cuma"))
        {System.out.println("muslumanlar icin kutsal gun");}

        if (gun.equals("cumartesi"))
        { System.out.println("yahudiler icin kutsal gun");}

        if (gun.equals("pazar")) {System.out.println( "hristiyanlar icin kutsal gun");}
        else {
            System.out.println("gecerli bir gun giriniz");
        }


    }
}
