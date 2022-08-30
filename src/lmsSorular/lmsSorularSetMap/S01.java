package lmsSorular.lmsSorularSetMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S01 {
    public static void main(String[] args) {
        /*
        Bir listede kaç farklı öğe olduğunu gösteren kodu yazın.
Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
         */
        List<Integer> list = new ArrayList<Integer>(List.of(10, 31, 15, 7, 15, 7, 7));

        Set<Integer> set=new HashSet<>();
        set.addAll(list);

        System.out.println("Farkli oge sayisi "+set.size());





    }
}
