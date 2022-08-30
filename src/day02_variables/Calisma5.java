package day02_variables;

import java.util.Scanner;

public class Calisma5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı1 giriniz");
        int sayı1=scan.nextInt();
        System.out.println("sayı2 girirniz");
        int sayı2=scan.nextInt();
        System.out.println("girdiğiniz sayılar" +sayı1 +sayı2);
        System.out.println("toplam" +(sayı1+sayı2));
        System.out.println("çarpım" +(sayı1*sayı2));
        System.out.println("fark" +(sayı1-sayı2));
    }
}
