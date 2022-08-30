package lmsSorular.lmsSorularSetMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S04 {
    public static void main(String[] args) {
        /*
        Listeden bir Kümedeki farklı öğeleri yazdırmak için kod yazın
         */

    List<String> liste=new ArrayList<String>(List.of("kalem","silgi","defter","kalem","canta","kitap","defter"));

    Set<String> sete=new HashSet<String>(List.of("kalem","silgi","defter","suluk"));

     sete.removeAll(liste);
        System.out.println(sete);









    }
}
