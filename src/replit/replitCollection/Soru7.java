package replit.replitCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Soru7 {
    public static void main(String[] args) {

            // bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
            // LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
            //1. elemandan itibaren yazdıralım.
            LinkedList<String> elemanlar = new LinkedList<String>();
            elemanlar.add("sari");
            elemanlar.add("beyaz");
            elemanlar.add("mavi");
            elemanlar.add("yesil");
            elemanlar.add("turuncu");

            Iterator<String> it = elemanlar.iterator();

            while (it.hasNext()) {
                System.out.print(it.next()+" ");
            }
    }
}
