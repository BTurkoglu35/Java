package day21_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calisma14 {
    public static void main(String[] args) {
       // Bir diziden yinelenen öğeleri kaldırmak için bir Java programı yazın.

      int[] sayilar= {1,5,4,7,8,9,4,1};

      List<Integer> sayilar1=new ArrayList<Integer>();
        for (int i = 0; i < sayilar.length; i++) {
            sayilar1.add(sayilar[i]);
        }
        System.out.println("sayilar1 = " + sayilar1);
        Collections.sort(sayilar1);
        System.out.println("sayilar1 = " + sayilar1);//sayilar1 = [1, 1, 4, 4, 5, 7, 8, 9]

        for (int i = 0; i < sayilar1.size()-1; i++){
            for (int j = i+1; j <sayilar1.size() ; j++) {
                if (sayilar1.get(i) == sayilar1.get(j)){
                    sayilar1.remove(sayilar1.get(j));//[1, 4, 5, 7, 8, 9]

                }

            }
        }
        System.out.println("sayilar1 = " + sayilar1);

     


    }


    }

