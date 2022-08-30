package replit.replitCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Soru8 {
    public static void main(String[] args) {
    //    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
    //    LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
        LinkedList renkler = new LinkedList(List.of("sari,mavi,turuncu,siyah,yesil,beyaz"));
        System.out.println(renkler);

        Iterator<String> liste=renkler.iterator();
       String[] list;
       while (liste.hasNext()){

           list=liste.next().split(",");
           System.out.println("listenin ilk elemani "+list[0]);
           System.out.println("listenin son elemani"+list[list.length-1]);

       }

    }

    }

/*


 */