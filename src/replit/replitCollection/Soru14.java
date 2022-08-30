package replit.replitCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class Soru14 {
    public static void main(String[] args) {
       // Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.
       //TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

        TreeSet<String> liste=new TreeSet<>();
        liste.add("yesil");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("sari");
        liste.add("turuncu");

        Iterator<String> it = liste.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
