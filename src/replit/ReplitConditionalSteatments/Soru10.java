package replit.ReplitConditionalSteatments;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli
        harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın.
        Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
        (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen harf giriniz");
       // char harf=scan.next().charAt(0);
        String harf1=scan.next();
    char harf=harf1.charAt(0);

        if(harf1.length()>1||!(harf>='a'&&harf<='z'||harf>='A'&&harf<='Z')) {
            System.out.println("gecersiz giris");
        }else if(harf=='a' ||harf=='e'||harf=='i'||harf=='o'||harf=='u'||
                harf=='A' ||harf=='E'||harf=='I'||harf=='O'||harf=='U')
        {
            System.out.println("sesli harf");
        }else if(harf>='a'&&harf<='z'||harf>='A'&&harf<='Z') {
            System.out.println("sessiz harf");


        }
    }
}
