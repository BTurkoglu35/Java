package replit.replitCollection;

import day40_final.A;

import java.util.Arrays;
import java.util.TreeSet;

public class Soru17 {
    public static void main(String[] args) {
        //   Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes" farklı olanlar için "no" yazdıralım.
        //        1.TreeSet: mavi,yesil,kirmizi,sari

        //   2.TreeSet: yesil,mavi,pembe,turuncu
        TreeSet<String> treeSet1 = new TreeSet<String>();
        treeSet1.add("mavi");
        treeSet1.add("yesil");
        treeSet1.add("kirmizi");
        treeSet1.add("sari");


        TreeSet<String> treeSet2 = new TreeSet<String>();
        treeSet2.add("yesil");
        treeSet2.add("mavi");
        treeSet2.add("pembe");
        treeSet2.add("turuncu");

        for (String each:treeSet1
             ) {
            if(treeSet2.contains(each)){
                System.out.println("yes");
            }else System.out.println("no");
        }






        }
           }
