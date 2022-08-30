package practice_04;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
        /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

        Scanner scan=new Scanner(System.in);
        System.out.println("uzunluk giriniz");
        double cm=scan.nextDouble();

        convertcm(cm);

    }

    private static void convertcm(double cm) {
        double metre=cm/100;
        double km=cm/100000;
        System.out.println("girdiginiz cm degeri:"+cm+"cm  "+metre+" metre "+km+"km dir");

    }
}
