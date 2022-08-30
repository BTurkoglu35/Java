package day14_methodCreation;

import java.util.Scanner;

public class Calisma11 {
    public static void main(String[] args) {
        
    
    /*  Test Verileri
        Ay sayısı giriniz: 2
        Yılda giriniz: 2016
        Beklenen Çıktı :
        Şubat 2016'da 29 gün vardır
        method olustrlim*/


        Scanner scan = new Scanner(System.in);System.out.println("lutfen ay giriniz");
        String ay=scan.nextLine();
        System.out.println("lutfen yil giriniz");
        int yil=scan.nextInt();
        
        gunGetir(ay,yil);



    }

    public static void gunGetir(String ay, int yil) {
        int gun=0;
        switch (ay) {
            case "ocak":
                System.out.println("31 gun vardir");
                break;
            case "subat":
                if (yil % 4 == 0 || yil % 400 == 0 && yil % 100 != 0) {
                    System.out.println("29 gun vardir");
                } else System.out.println("28 gun vardir");
                break;
            case "mart":
                System.out.println("31 gun vardir");
                break;
            case "nisan":
                System.out.println("30 gun vardir");
                break;
            case "mayis":
                System.out.println("31 gun vardir");
                break;
            case "haziran":
                System.out.println("30 gun vardir");
                break;
            case "temmuz":
                System.out.println("31 gun vardir");
                break;
            case "agustos":
                System.out.println("31 gun vardir");
                break;
            case "eylul":
                System.out.println("30 gun vardir");
                break;
            case "ekim":
                System.out.println("31 gun vardir");
                break;
            case "kasim":
                System.out.println("30 gun vardir");
                break;
            case "aralik ":
                System.out.println("31 gun vardir");
                break;

        }
    }}