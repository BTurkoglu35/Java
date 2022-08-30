package day02_variables;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yükseklik giriniz");
        int yukseklik=scan.nextInt();
        System.out.println("uzun kenar giriniz");
        int uzunkenar=scan.nextInt();
        System.out.println("kısa kenar giriniz");
        int kısakenar=scan.nextInt();
        System.out.println("girdiğiniz uzun kenar:" +uzunkenar +"kısakenar:" +kısakenar +"yükseklik:" +yukseklik );
        System.out.println("prizmanın hacmi:" +uzunkenar*kısakenar*yukseklik);

    }
}
