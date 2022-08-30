package day21_arrays;

import java.util.Arrays;

public class C06_ArraysElemanEkleme {
    public static void main(String[] args) {
        //C05 deki methodu kullanarak arraya eleman ekleyelim

        String[] takimListesi={"suleyman","Osman"};
        String eklenecekIsim="Talha";
         takimListesi=C05_ArraysElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));












    }
}
