package day38_exceptions;

public class C01_Exceptoins {
    public static void main(String[] args) {
   /*
   bir sorunlakarsilasmayi beklediginiz noktalarda if else ile sorunu yakalayip onunla ilgil coum uretebilrsiniz

   ama java sorunu her zaman if else ile cozemeyecegimizden java try-catch bloklari olusturmustur
    */

        int a = 1000;
        int b = 50;
        int sayac=1;
        while (sayac<100){

            System.out.println(a/b);
                    b--;
                   sayac++;
    }
}}