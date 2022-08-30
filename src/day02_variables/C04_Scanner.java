package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz.");
        String kullanıcıIsmi=scan.next();
        System.out.println("kullanıcın girdiği isim:" +kullanıcıIsmi);

    }
}
