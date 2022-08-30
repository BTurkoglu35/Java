package day24_arrsylist_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class Calisma08_List {
    public static void main(String[] args) {
        //  istede 15 veya 13 varsa, bunları kaldırın
        //  Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(14);
        sayilar.add(13);
        sayilar.add(54);
        for (int i = 0; i <sayilar.size();i++) {
            if(!(sayilar.contains(15)||sayilar.contains(13))){
                System.out.println("liste 15 veya 13 icermiyor");
                break;
            }
            if (sayilar.get(i)==15) {
                sayilar.remove(i);
            }if (sayilar.get(i)==13) {
                sayilar.remove(i);
            }

        }
        System.out.println(sayilar);

    }
}