package day21_arrays;

import java.time.chrono.MinguoDate;
import java.util.Arrays;

public class Calisma15 {
    public static void main(String[] args) {
        //Bir dizideki en büyük ikinci elemanı bulan bir Java programı yazın.
        int[] arr={12,45,32,14,85,46};

        Arrays.sort(arr);
        System.out.println("arr = " +Arrays.toString(arr));//[12, 14, 32, 45, 46, 85]

        System.out.println("enbuyuk ikinci eleman = " +arr[arr.length - 2]);


      //Bir dizideki en küçük ikinci elemanı bulan bir Java programı yazın.

        System.out.println("en kucuk ikinci elaman"+arr[1]);











    }
}
