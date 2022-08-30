package day16_forLoop;

import java.util.Scanner;

public class CalismaReplitDonguler1 {
    public static void main(String[] args) {
        //  Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak
        // karakterin isimde kaç kez tekrarlandığını kontrol edin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println("lutfen karakter giriniz");
        char karakter=scan.next().charAt(0);
        int karakterSayisi=0;
        for (int i = 0; i <isim.length() ; i++) {
            if (karakter == isim.charAt(i)) {
                karakterSayisi++;



            }

        } System.out.println(karakterSayisi);


    }

}
