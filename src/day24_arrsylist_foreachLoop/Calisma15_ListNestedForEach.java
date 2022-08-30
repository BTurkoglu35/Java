package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class Calisma15_ListNestedForEach {
    public static void main(String[] args) {

       // Döngüler kullanarak bir tamsayı Listesindeki tüm öğelerin benzersiz olup olmadığını kontrol edin.

        List<Integer> numbers=new ArrayList<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(8);
        numbers.add(4);
        numbers.add(14);
        numbers.add(1);
        numbers.add(19);
        int count=0;
        for (int each:numbers
             ) {
            for (int w:numbers
                 ) {
                if(each==w){
                    count++;

                }
            }
        }
        if (count==numbers.size()){
            System.out.println("there is no repeated element");


        }else System.out.println("At least one element was repeated");










    }
}
