package day06_concanation;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {
        String str1="Java";
        String str2="guzeldir";
        int sayi1=5;
        int sayi2=4;
        System.out.println(str1+"  "+str2+"   "+sayi1+sayi2);
        System.out.println(str1+"   "+str2+"     "+(sayi1+sayi2));
        System.out.println((sayi1+sayi2)+"    "+ str1);
        System.out.println(sayi1+(sayi2+"    "+str2));


        //2
        String str = "Java ile hayat guzeldir";
        System.out.println(str.toUpperCase());

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        String ogrenciNo="1254847";
        Scanner scan= new Scanner(System.in);
        System.out.println("6 basamakli sifre giriniz");
        String sifre=scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println();
    }
}
