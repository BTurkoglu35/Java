package day13_methodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static <Tarayıcı> void main(String[] args) {



    /*Soru 6) Kullanicidan bir sifre girmesini isteyin.
    Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
    sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;

        //ilk harf kontrolu
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            kontrol++;
        } else System.out.println("lutfen ilk harfi buyuk giriniz");

        // son harf kontrolu
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() -1) <= 'z') {
            kontrol++;
        } else System.out.println("lutfen son harfi kucuk giriniz ");

        // bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("lutfen bosluk birakmayiniz");
        }else  kontrol++;

        //sifre uzunluk en az 8 olmali
        if(sifre.length()>=8) {
            kontrol++;
        }else System.out.println("lutfen en az 8 karakterli bir sifre diriniz");

        if(kontrol==4){
            System.out.println("Sifre basari ile tanimlandi");
        }else System.out.println("Islem basarisiz,Lutfen yeni bir sifre giriniz");
    }
}