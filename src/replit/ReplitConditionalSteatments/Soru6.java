package replit.ReplitConditionalSteatments;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
    //    1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
      //  Hint: For döngüsü kullanınız.

        for (int i = 1; i <=20; i++) {
            System.out.println(i);
        }

     //   Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();
        for (int i =1; i <=10 ; i++) {
            System.out.println(sayi+"*"+ i+"="+(sayi*i));
        }



    }
}
