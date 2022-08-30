package day20_arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirms {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6,7};
        //Array'in tamamini yazdiralim

        System.out.println(Arrays.toString(sayilar));//{1,2,3,4,5,6,7};

        //Array'in tum elementlerini yazdiralim'
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.print(sayilar[i]+" ");

        }

    }
}
