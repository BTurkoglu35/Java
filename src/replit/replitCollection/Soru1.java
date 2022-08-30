package replit.replitCollection;

import java.util.ArrayList;
import java.util.List;

public class Soru1 {
    public static void main(String[] args) {
     //   Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
      //          Array elemanları: siyah,sari,mavi,turuncu

        List<String> list = new ArrayList<String>();
        list.add("siyah");
        list.add("mavi");
        list.add("sari");
        list.add("turuncu");

        for (int i = 0; i <list.size(); i++)  {
            System.out.println(list.get(i));

        }






    }
}
