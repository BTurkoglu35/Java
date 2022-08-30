package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calisma13_ListdoubleValueOf {
    public static void main(String[] args) {
     //   Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulun
     //   Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70


        List<String> myList =new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");
       List<Double> decimal=new ArrayList<Double>();

        for (String each:myList
             ) {
            Double price = Double.parseDouble(each.replace("$", ""));
           // Double price = Double.valueOf(each.replace("$", ""));  //ikiside ayni sonucu veriyor.
            //Stringi double sayiya cevirme
            decimal.add(price);
        }
        System.out.println(decimal);
        Collections.sort(decimal);
       double toplam=decimal.get(0)+decimal.get(decimal.size()-1);
        System.out.println(toplam);












    }
}
