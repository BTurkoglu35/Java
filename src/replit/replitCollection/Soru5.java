package replit.replitCollection;

import java.util.ArrayList;

public class Soru5 {
    public static void main(String[] args) {
     //   Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
     //   ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

        ArrayList<String> list = new ArrayList<String>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");
        list.add("turuncu");
        System.out.println( list);

        for (int i = 0; i <list.size(); i++)  {

            System.out.println( list.get(i));


        }







    }
}
