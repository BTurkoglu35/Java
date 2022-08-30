package day14_methodCreation;

import java.util.Scanner;

public class Calisma4 {
    public static void main(String[] args) {
      /*  Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
        @ isareti icermiyorsa gecersiz email yazdirin
        @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
        @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"*/

                emailAl();
    }

    private static void emailAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ltfen email  adresinizi giriniz");
        String email = scan.nextLine();
         if (!email.contains("@")) {
             System.out.println("gecersiz email adresiniz ");
         }else if (!email.contains("@gmail.com")) {
             System.out.println("lutfen gmail adresinizi girin");

         } else if (!email.endsWith("gmail.com")) {
             System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
         }else
             System.out.println("email basarili");


    }
}
