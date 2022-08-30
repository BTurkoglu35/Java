package day22_multiDimensionalArray;

import java.util.Arrays;

public class calisma7 {
    public static void main(String[] args) {

           //ir diziden belirli bir elemanı çıkarmak için bir Java programı yazın


        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int indexKalkicak=3;
        for (int i = indexKalkicak; i <my_array.length-3; i++)  {
            my_array[i] = my_array[i+1];

        }
        System.out.println(Arrays.toString(my_array));
    }
}
