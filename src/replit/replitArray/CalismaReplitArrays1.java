package day22_multiDimensionalArray;

import java.util.Arrays;

public class CalismaReplitArrays1 {
    public static void main(String[] args) {
        /*
        Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.
            Test Data:
            [1232, 1134,2345,1022]
            [Java, Python, PHP, C#, C Programming, C++]
         */

        int[] arr={1232, 1134,2345,1022};
        String[] arr1={"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));












    }
}
