package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_Linkedlist_ListDataTuru {
    public static void main(String[] args) {


        LinkedList ll1=new LinkedList<>();


        List<String> ll2=new LinkedList<>();

        Queue<String> ll3=new LinkedList<>();

        Deque<String> ll4=new LinkedList<>();


       ll2.add("berk");
       ll2.add("ayse");
       ll2.add("enes");
       ll2.add("mustafa");
        System.out.println(ll2.remove(3));//mustafa
        //eger listemiz integer elemenletrden olusuyorsa direk sayi yazarsak index olarak kabul ederdi
        //ama bir variable'a atama yapar ve removo da o variable'in ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("kemal"));//false
        System.out.println(ll2.isEmpty());//false

        ll2.set(1,"serap");
        System.out.println(ll2);//[berk, serap, enes]


        ll1.add("berk");
        ll1.add("selman");
        System.out.println(ll1);//[berk, selman]

        ll2.retainAll(ll1);//ortak olanlari yazar

        System.out.println(ll2);//[berk]

        System.out.println(ll2.hashCode());//3020251

        ll2.add("fatih");

        System.out.println(ll2.hashCode());//190831485





    }
}
