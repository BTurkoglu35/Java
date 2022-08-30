package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru 10 ) Kullanicidan iki sayi isteyin.
        //Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //sonucu yazdiran bir method yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis noktalarini giriniz");
        int baslangic = scan.nextInt();
        int sonuc = scan.nextInt();
        aralariTopla(baslangic,sonuc);


    }

    public static void aralariTopla(int baslangic, int sonuc) {
        int toplam=0;
        if(baslangic<=sonuc) {
            for (int i = baslangic; i <= sonuc; i++) {

                toplam += i;
            }
        }else{
            for (int i=sonuc ; i<=baslangic; i++) {
                toplam += i;

            }
        }
        System.out.println(toplam);

    }
}
