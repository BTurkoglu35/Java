package day21_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calisma11 {
    public static void main(String[] args) {
     //   11. Bir tamsayı değeri dizisini tersine çeviren bir Java programı yazın.

   int[] arr={1,2,3,4,5,6,7,8,9};

    List<Integer>reverse = new ArrayList<Integer>();
        for (int i = 0; i <arr.length; i++){
            reverse.add(arr[i]);

        }
        Collections.reverse(reverse);
        System.out.println(reverse);

        for (int i = 0; i <reverse.size(); i++){
            arr[i] = reverse.get(i);
        }
        System.out.println(Arrays.toString(arr));

        }









    }

