package day18_while_doWhileLoop;

import java.util.Scanner;

public class Calisma8 {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //Kullanici yanlislikla negative sayi girerse
        //sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
        // toplaminin kac oldugunu yazdirin.

     int pozitifSayiAdedi=0;
     int negSayiAdedi=0;
     int pozSayiTop=0;
     Scanner scan =new Scanner(System.in);
     int sayi=0;


     do {
         System.out.println("lutfen pozitif tam sayi giriniz, islemi bitirmek icin sifira basiniz");
         sayi=scan.nextInt();
         if(sayi>0) {
             pozSayiTop+=sayi;
             pozitifSayiAdedi++;
         }else if(sayi<0) {
             System.out.println("Negatif sayi giremezsiniz");
             negSayiAdedi++;
         }
     }while (sayi!=0);
        System.out.println(pozitifSayiAdedi+"pozitif sayi girdiniz, sayilarin toplami  "+pozSayiTop);
        System.out.println(negSayiAdedi+"negatif sayi girdiniz, sayilar toplama dahil edilmedi");







    }
}
