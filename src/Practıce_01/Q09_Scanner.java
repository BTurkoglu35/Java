package Practıce_01;

import java.util.Scanner;

public class Q09_Scanner {
    public static void main(String[] args) {


// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String isim=scan.nextLine();

        System.out.println("memleketinizi giriniz");
        String memleket=scan.nextLine();

        System.out.println("konumunuzu giriniz");
        String konum=scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("boyunuzu giriniz");
        double boy=scan.nextDouble();

        System.out.println("yasadiginiz " +konum +"u seviyor musunuz? true/ false gir");
        boolean seviyorMu=scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);


    }






}
