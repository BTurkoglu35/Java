package day14_methodCreation;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {


   // Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
    //kucuk mu oldugunu, ayrica ve 100'den buyukse birler, onlar ve yuzler basamagindaki
//    rakamlarin toplamini, 100'den kucukse sadece birler basamagini yazdiran 3 method
   // olusturun.
    Scanner scanner = new Scanner(System.in);
        System.out.println(" lutfen bir sayi giriniz");
        int sayi= scanner.nextInt();

        sayiTekCift(sayi);
        sayiNegatifPozitif(sayi);
        sayiYuzdenBuyukKucuk(sayi);

    }
    private static void sayiTekCift ( int sayi){
        System.out.println(sayi % 2 == 0 ? "sayi cift" : "sayi tek");
    }

    private static void sayiNegatifPozitif (int sayi) {
        System.out.println(sayi < 0 ? "sayi negatif" : "sayi pozitif");

    }
    private static void sayiYuzdenBuyukKucuk(int sayi) {
        if (sayi >= 100) {
            int rakamlarToplami = sayi % 10;
            sayi /= 10;
            rakamlarToplami += sayi % 10;
            sayi /= 10;

            rakamlarToplami += sayi;
            System.out.println("rakamlarToplami = " + rakamlarToplami);
        } else if (sayi < 100) {
            System.out.println("birler basamagi" + sayi % 10);

        }






    }


}





