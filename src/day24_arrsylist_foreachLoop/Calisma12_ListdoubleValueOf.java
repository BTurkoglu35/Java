package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class Calisma12_ListdoubleValueOf {
    public static void main(String[] args) {
    //   Bir Dize listesinde verilen tüm fiyatların toplamını bulun
    //   Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> myList = new ArrayList<String>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double toplam=0;
        for (String s : myList
            ){
            Double price = Double.valueOf(s.replace("$", ""));
            toplam += price;
        }
        System.out.println("$"+toplam);
            















    }
}
