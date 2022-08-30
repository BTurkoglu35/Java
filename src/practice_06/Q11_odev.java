package practice_06;

import java.util.Scanner;

public class Q11_odev {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin="mehmet.12304";
        int girisHakki=3;
        Scanner scan=new Scanner(System.in);
        System.out.println("********HOSGELDINIZ****");
        while (true) {
            System.out.println("pin kodu giriniz: " );
            String girilenPin=scan.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz");
                break;
            }else {
                System.out.println("yanlis giris yaptiniz...c");
                girisHakki--;
                System.out.println("kalan giris hakkiniz: "+girisHakki);
            if(girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi..bloklaandinziz");
                break;
            }
        }}




















    }
}
