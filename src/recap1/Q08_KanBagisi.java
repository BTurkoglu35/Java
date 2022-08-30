package recap1;

import java.util.Scanner;

public class Q08_KanBagisi {
    public static void main(String[] args) {

       /*
      Problem tanimi :
      Kullanicidan  yasini ve kilosunu alaliniz
      18 yasindan kucuk ise kan bagisi yapamaz
       18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
      18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
      */

        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        double yas=scan.nextDouble();

        System.out.println( "kilonuzu giriniz");
        double kilo=scan.nextDouble();

        if (yas>0 && yas<18) {
            System.out.println("yasi 18 den kucuk olanlar kan bagisi yapamaz");
        } else if (yas>=18) {
            if (kilo<50)
            {
                System.out.println("kilonuz 50 alti oldugu icin kan bagisi yapamazsiiniz");
            }else if (kilo>50){
                System.out.println("kan bagisi yapabilrisiniz");
            }

        }


    }
}
