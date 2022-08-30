package lmsSorular.lmsSorularSetMap;

import java.util.*;

public class S02 {
    public static void main(String[] args) {
        /*
        Bir String'de kullanılan farklı karakterleri yazdırmak için kod yazın
Örnek: 'Mississippi' Ş Misp
         */

        String str="Missisipi";
        String[]arr=str.split("");

        List<String> strList= Arrays.asList(arr);


        Set<String> set = new HashSet<String>(strList);
        System.out.println(set);
    }
}
