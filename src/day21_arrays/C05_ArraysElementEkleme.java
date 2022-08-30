package day21_arrays;

import java.util.Arrays;

public class C05_ArraysElementEkleme {
    public static void main(String[] args) {

       // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

 String[] sinifListesi={"Ali Can"};
 String eklnecekIsim="Murat";

 sinifListesi=elemanEkle(sinifListesi,eklnecekIsim);
        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklnecekIsim) {

   String[] yeniSinifListesi=new String[sinifListesi.length+1];//{null,null}
        //eski listeden bir eleman fazla uzunlukta yenibir array olustruduk
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }
      //  eski listedeki tum elmemanlari yeni listeye aktardim
       yeniSinifListesi[yeniSinifListesi.length-1]=eklnecekIsim;
   //eklenecek isimi de arrayin sonuna ekledimi


   return yeniSinifListesi;
    }
}
