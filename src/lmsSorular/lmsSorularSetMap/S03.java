package lmsSorular.lmsSorularSetMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S03 {
    public static void main(String[] args) {
        /*
        Küme ve Liste arasındaki ortak öğeleri yazdırmak için kod yazın
         */

        List<String> list = new ArrayList<String>(List.of("ali","merve","sefa","yusuf"));

        Set<String> set = new HashSet<String>(List.of("berra","merve","fatma","yusuf"));
        set.retainAll(list);
        System.out.println(set);


    }
}
