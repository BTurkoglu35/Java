package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_Linkedlist_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3=new LinkedList<>();
        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("polat");
        ll3.add("kadir");

        //Queue kuyruk demektir ,sira onemlidir. Gelen sona gelir,giden bastan gider

        System.out.println(ll3);//[adem, zeynep, polat, kadir]

        System.out.println(ll3.remove());//adem

        System.out.println(ll3);//[zeynep, polat, kadir]

        System.out.println(ll3.remove("polat"));//true

        System.out.println(ll3);//[zeynep, kadir]

        System.out.println(ll3.element());//ilk elementi getirir
        System.out.println(ll3);

        System.out.println(ll3.peek());//ilk elementi dondurur
        System.out.println(ll3);


        Queue<String> ll4=new LinkedList<>();
     //   System.out.println(ll4.element()); =>throws exception
        System.out.println(ll4.peek());//null
        //peek ve element bize ilk elementi dondurur
        // liste bos ise element exception peek ise null degeri dondurur

        ll3.offer("ahmet");
        System.out.println(ll3);//[zeynep, kadir, ahmet] add methodu ile ayni elementi sona ekler

        System.out.println(ll3.poll());//zeynep // bastakini siler ve sildigini dondurur

        System.out.println(ll3);///[kadir, ahmet]

       // System.out.println(ll4.remove());//bos oldugu icin NoSuchElementException

        System.out.println(ll4.poll());//null


    }
}
