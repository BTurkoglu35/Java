package replit.replitCollection;

import java.util.ArrayList;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {
    //  Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
    //          Array List: siyah,mavi,kirmizi,beyaz
    //  en başa: pembe
    //  mavi-kirmizi arasına yesil renk eklenecek.

   List<String> list = new ArrayList<String>();
   list.add("siyah");
   list.add("mavi");
   list.add("kirmizi");
   list.add("beyaz");
        System.out.println(list);

   list.add(0,"pembe");
   list.add(2   ,"yesil");
        System.out.println(list);


    }
}
