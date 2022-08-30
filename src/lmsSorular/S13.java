package lmsSorular;

import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {
        /*
        Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorun. Ardından şu kodu yazın
bu fibonacci sayıları. Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kac tane fibonacci sayisi gormek istiyorsunuz");
        int sayi=scan.nextInt();

        int fibo1=1;
        int fibo2=1;
        System.out.println(fibo1+" ");
        System.out.println(fibo2+" ");
        int fionacci=0;


        for (int i = 1; i <sayi-1 ; i++) {
           fionacci=fibo1+fibo2;
           fibo1=fibo2;
           fibo2=fionacci;

            System.out.println(fionacci+" ");
        }













    }
}
