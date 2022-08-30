package day14_methodCreation;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {
     /*   Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
        numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
        sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
        duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
        geri dondurun.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String isim = scan.nextLine();
        System.out.println("lutfen soysim giriniz");
        String soyIsim = scan.nextLine();
        System.out.println("kart numarasi giriniz");
        String kartNo = scan.nextLine();
       String isimSoyisim=ilkHarfBuyuk(isim,soyIsim);
       String kartDuzeltme=kartNoBosluk(kartNo);
        System.out.println(isimSoyisim);
        System.out.println(kartDuzeltme);
    }


    private static String ilkHarfBuyuk(String isim, String soyIsim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();
        return isim+"  "+soyIsim;
    }
    private static String kartNoBosluk(String kartNo) {
        kartNo=kartNo.substring(0,4)+"  "+kartNo.substring(4,8)+" "+kartNo.substring(8,12)+" "+kartNo.substring(12,16);
        return kartNo;
    }




}





