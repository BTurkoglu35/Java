package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class Calisma06_List {
    public static void main(String[] args) {
      //  Bir tamsayı listesindeki tüm çift liste öğelerinin çarpımını bulun
        List<Integer> sayilar=new ArrayList<Integer>();
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(9);
        sayilar.add(8);
        sayilar.add(10);

         int carpim=1;
        for (int each: sayilar
             ) {
            if(each%2==0){
                carpim*=each;
            }
            
        }
        System.out.println(carpim);
        
        
        
        
        
        
        
    }
}
