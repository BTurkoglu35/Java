package Practice_11;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        //bunu kart sifre kontrol de de kullabilirinisz
        Scanner scan=new Scanner(System.in);
        String sifre="erdal.bey123";
        int girisSayisi=3;
        System.out.println("bir sifre giriniz");
        String str=scan.nextLine();

        while (true){
            System.out.println("sifre gir");
            String girilensifre=scan.nextLine();
            if(sifre.equals(girilensifre)){
                System.out.println("sifren basarili");
                break;
            }else System.out.println("sifren yanlis");
            girisSayisi--;
            System.out.println("kalan giris hakkin "+girisSayisi);
            if(girisSayisi==0){
                System.out.println("GIRIS HAKKIN KALMADI KART BLOKE"+girisSayisi);

        }
        }












    }
}