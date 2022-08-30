package day18_while_doWhileLoop;

import java.util.Scanner;

public class Calisma7 {
    public static void main(String[] args) {
        //kullanicidan toplamak uzere pozitif tam sayilar isteyin, islemi bitirmek
        //icin 0 a basmasini soyleyin.
        //kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve
        // giridigi pozitif sayilarin toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayilarinTop=0;
        int sayilarinAdedi=0;

        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            sayilarinTop+=sayi;
            sayilarinAdedi++;

        }while (sayi!=0);
        System.out.println("girilen sayilarin toplami:  "+sayilarinTop);
        System.out.println("girilen sayilarin adedi: "+sayilarinAdedi);
















    }
}
