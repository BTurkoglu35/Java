package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_Linkedlist_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4 = new LinkedList<>();
        ll4.add("cavidan");
        ll4.add("mesut");
        ll4.add("selim");
        ll4.add("tevfik");
        ll4.add("selim");

        ll4.removeLastOccurrence("selim");
        System.out.println(ll4);










    }
}
