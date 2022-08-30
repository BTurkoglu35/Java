package replit.replitCollection;

import java.util.PriorityQueue;

public class Soru18 {
    public static void main(String[] args) {
   /*
   Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.

priority queue elemanları: sari,yesil,mavi,kirmizi

    */
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("sari");
        priorityQueue.add("yesil");
        priorityQueue.add("mavi");
        priorityQueue.add("kirmizi");

        System.out.println("PriorityQueue elemanlari "+priorityQueue);







    }
}
