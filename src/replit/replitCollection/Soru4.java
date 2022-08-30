package replit.replitCollection;

import java.util.ArrayList;
import java.util.List;

public class Soru4 {
    public static void main(String[] args) {
    //   Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
    //   Array Elemanları: sari,yesil,mavi,pembe
    //   mavi rengini turuncu ile değiştirelim.
        List<String> list = new ArrayList<String>();
        list.add("sari");
        list.add("yesil");
        list.add("mavi");
        list.add("pembe");


        list.set(2,"turuncu");
        System.out.println(list);














    }
}
