package day16_forLoop;

import java.util.Scanner;

public class Calisma7 {
    public static void main(String[] args) {
        //kullanicida ikii sayi isteyelim
        // sayilarin ebob ve ekoklarini blunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        int ebob=1;
        for (int i =1; i <=sayi1 ; i++) {
            if (sayi1%i==0&&sayi2%i==0) {
              ebob=i;
            }


        }System.out.println("ebob= " +ebob);
        System.out.println("ekok= " +(sayi1*sayi2)/ebob);














    }
}
