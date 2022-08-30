package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalismaSlaytSoru5 {
    public static void main(String[] args) {
         /*
        Verilen bir sayidan kucuk tum Fibonacci sayilarini bir liste olarak olusturup yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        int a=0;
        int b=1;
        int c = 0;
        List<Integer> fibanocci=new ArrayList<Integer>();


        for (int i = 0; i <sayi; i++) {
            a=b;
            b=c;
            c=a+b;

            fibanocci.add(i,c);
        }


        System.out.println(fibanocci);


      //farkli cozum

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz : ");
        int sayii= scan.nextInt();
        int sayi1=0;
        int sayi2=1;
        int sayi3=1;
        List<Integer> fibo=new ArrayList<>();

        while(sayii>sayi3){
            sayi3=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;

            fibo.add(sayi1);

        }

        System.out.println(fibo);
















    }
}
