package day03_variables;

import java.util.Scanner;

public class C07_TekScanner {
    public static void main(String[] args) {
        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz
        Scanner scan = new Scanner(System.in);
       System.out.println("lutfen isminizi soyisminizi yasinizi giriniz \n entera basarak devam ediniz");
       String isim=scan.nextLine();
       String soyisim=scan.nextLine();
       double yas=scan.nextDouble();
        // girilen bilgiler = seyfi capar 34  seklinde yazdirin
        System.out.println("girilen bilgiler: " +isim +"   "+soyisim +"   " +yas);

    }

    }