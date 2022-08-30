package day21_arrays;

import java.util.ArrayList;
import java.util.List;

public class Calisma13 {
    public static void main(String[] args) {
        //  Bir dizi değer dizisinin yinelenen değerlerini bulan bir Java programı yazın.


        String[] str = {"ali", "veli", "peri", "ali", "huri"};

        List<String> tekrarEden = new ArrayList<String>();
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    tekrarEden.add(str[j]);
                }
            }
        }
        System.out.println("tekrarEden = " + tekrarEden);


        //İki tamsayı dizisi arasındaki ortak öğeleri bulan bir Java programı yazın.
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    System.out.println("ortak eleman" + array1[i]);
                }

            }
        }


    }
}

