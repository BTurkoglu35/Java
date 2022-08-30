package day20_arrays;

import java.util.ArrayList;
import java.util.List;

public class Calisma14 {
    public static void main(String[] args) {
        // İki dizi (string değerleri) arasındaki ortak elemanları bulan bir Java programı yazın.

        String[] arr={"elma","karpuz","kavun","portakal"};
        String[] arr2={"karpuz","erik","uzum","kavun"};
        List<String> ortak=new ArrayList<String>();

        for (String each:arr) {
            for (String each2 : arr2) {
                if(each.equals(each2)){
                    ortak.add(each);
                }

            }
            System.out.println(ortak);





            }
        }



    }

