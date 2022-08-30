package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        ///verilen bir array'deki tekrar eden elementleri silip
        //tekrarsiz halini array'a atayan kod yaziniz

        int[] array = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};
        Set<Integer> set = new HashSet<Integer>();

        for (int each : array
        ) {
            set.add(each);
        }
        System.out.println(set);

        int[] yeniArr = new int[set.size()];

        int i = 0;
        for (Integer each : set) {
            yeniArr[i] = each;
            i++;
        }
        array = yeniArr;
        System.out.println("arrayin son hali" + Arrays.toString(array));


    }
}
