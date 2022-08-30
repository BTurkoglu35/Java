package practice_08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q07_SpecialCharRemoveArrayList {
    /*
 getSum isminde bir method oluşturun.
 Parametresi ArrayList'tir.
 Dizideki tüm $ ları kaldır ve tüm sayıları topla
 return yaptğımız veri tipi 'int' olmalıdır.
 sonuç 0'dan küçükse, -1 yazdırın.

 Örnek1:
 ArrayList = $13, $15, $20
 Cevap = 48 olmalı

 Örnek 2 :
 ArrayList= $-13, $0, $0
 Cevap = -1 olmalı.
  */
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("$13");
        arrayList.add("$15");
        arrayList.add("$20");

    getSum(arrayList);
        System.out.println(getSum(arrayList));


    }

    private static int getSum(List<String> arrayList) {
     int cevap = 0;
     List<Integer>sayilar= new ArrayList<Integer>();
        for (int i = 0; i <arrayList.size(); i++)  {
        sayilar.add(Integer.valueOf(arrayList.get(i).replace("$","")));
        }
        for (int i  = 0; i<sayilar.size(); i++)  {
            cevap+=sayilar.get(i);

            }





     return cevap;
    }
}