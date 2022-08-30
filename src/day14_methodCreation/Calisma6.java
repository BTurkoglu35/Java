package day14_methodCreation;

import java.util.Scanner;

public class Calisma6 {
    public static void main(String[] args) {
        //  Üç sayının ortalamasını hesaplamak için bir Java yöntemi yazın. Düzenleyiciye gidin
        //  Test Verileri:
        //  İlk sayıyı girin: 25
        //  İkinci sayıyı girin: 45
        //  Üçüncü sayıyı girin: 65
        //  Beklenen Çıktı:
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi1 giriniz");
        double sayi1 = scan.nextInt();
        System.out.println("sayi2 giriniz");

        double sayi2 = scan.nextInt();
        System.out.println("sayi3 giriniz");
        double sayi3 = scan.nextInt();

        double toplamOrtalama = toplamOrtalama(sayi1, sayi2, sayi3);
        System.out.println(toplamOrtalama);

    }

    private static double toplamOrtalama(double sayi1, double sayi2, double sayi3) {
        double toplamOrtalama = (sayi1 + sayi2 + sayi3) / 3;

        return toplamOrtalama;
    }


}
