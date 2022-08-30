package Practıce_01;

import java.util.Scanner;

public class Q08_Scanner01 {
    //kullanicidan iki tam sayi alin
    //bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("ikinci  tam sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println(sayi2+ sayi1);
    }
}
