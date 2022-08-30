package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler={"istanbul","ankara","mersin","konya","kastamonu"};
        String istenmeyenHarf="a";
        List<String> kalanlar=new ArrayList<String>();

        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }

        }
        System.out.println(kalanlar);
        //yeni bir array olusturup listeyi ona aktaralim
        String[] kalanlarArrayi=new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i] = kalanlar.get(i);
        }
        sehirler=kalanlarArrayi;
        System.out.println("sehirler arrayinin son hali: "+ Arrays.toString(sehirler));




















    }
}
