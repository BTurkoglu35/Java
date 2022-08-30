package day21_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calisma12 {
    public static void main(String[] args) {
        // Bir tamsayı değerleri dizisinin yinelenen değerlerini bulan bir Java programı yazın

        int[] arr={1,2,4,5,2,6,7,8,6,7};


        for (int i = 0; i < arr.length-1; i++) {
            for (int j =i+1; j < arr.length ; j++) {
              if (arr[i]==arr[j]) {
                  System.out.println("yinelenen oge"+arr[i]);
              }

            }

        }








    }
}
