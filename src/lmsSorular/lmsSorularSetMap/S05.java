package lmsSorular.lmsSorularSetMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S05 {
    public static void main(String[] args) {
        /*
        Bir Listenin tekrarlanan elemanları olup olmadığını kontrol etmek için kod yazın
         */


        List<String> liste=new ArrayList<String>(List.of("kalem","silgi","defter","kalem","canta","kitap","defter"));


       Set<String> listSet=new HashSet<String>();

       listSet.addAll(liste);
       if(listSet.size()<liste.size()) {
           System.out.println("tekrarlanan eleman vardir");

       }else System.out.println("tekrarlanan eleman yoktur");





    }
}
