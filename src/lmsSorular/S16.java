package lmsSorular;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        /*
        Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazın. Örnek: eğer kullanıcı
20 çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();

        asalYazdir(sayi);


    }

    private static boolean isAsal(int sayi) {
        if (sayi<=1){
            return false;
        }
        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                return false;
            }
        }
        return true;
    }
    public static void asalYazdir(int sayi){
        for (int i = 2; i <=sayi ; i++) {
            if(isAsal(i)){
                System.out.println(i+" ");
            }
        }
    }
}
