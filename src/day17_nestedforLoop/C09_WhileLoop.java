package day17_nestedforLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

    /*Soru 6) Kullanicidan bir sifre girmesini isteyin.
    Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
    sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
    ve basarili sifre girene kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi) {
            //kullanicidan bir sifre alalim
            System.out.println("lutfen sifre giriniz");
            sifre = scan.nextLine();
            //4 kom=ntrol yapalim her bir kontrolden sonra ++ koyalim
            //ilk harf kontrolu
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else System.out.println("lutfen ilk harfi buyuk giriniz");

            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else System.out.println("lutfen son harfi kucuk giriniz ");

            // bosluk icermemeli
            if (sifre.contains(" ")) {
                System.out.println("lutfen bosluk birakmayiniz");
            } else kontrol++;

            //sifre uzunluk en az 8 olmali
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("lutfen en az 8 karakterli bir sifre diriniz");

            }
            if (kontrol == 4) {
                System.out.println("sifre basari ile tanimlandi");
                sifreBasariliMi = true;
            } else {//sifre basarisizsa tekrar basa donecek
                //kontrol variable sifirlanmali
             kontrol=0;

            }

        }
    }

}