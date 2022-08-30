package replit.replitCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Soru9 {
    public static void main(String[] args) {
      //  Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
      //          LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

        LinkedList<String> renkler = new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("mor");

        ListIterator list1=renkler.listIterator();

        while (list1.hasNext()){
            list1.next();
        }
        while (list1.hasPrevious()){
            System.out.println(list1.previous());
        }




















    }
}
