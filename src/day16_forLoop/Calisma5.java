package day16_forLoop;

import java.util.Scanner;

public class Calisma5 {
    public static void main(String[] args) {
        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 10 dan kucuk bir tamsayi giriniz");
        int sayi=scan.nextInt();
        int faktoryel=1;
        for (int i =sayi; i >=1 ; i--) {

            faktoryel*=i;
        }
        System.out.println(faktoryel);
    }
}
