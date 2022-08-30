package replit.replitCollection;

import java.util.LinkedList;
import java.util.List;

public class Soru10 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
         */

        LinkedList<String> list=new LinkedList<>();
        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");
        list.add("siyah");
        list.add("yesil");
        list.add("turuncu");

        System.out.println(list);
        String temp="***"+list.get(3)+"***";
        String temp2="***"+list.get(0)+"***";
        for (int i = 0; i <list.size() ; i++) {
            list.set(0,temp);
            list.set(3,temp2);
        }
        System.out.println(list);



    }
}
