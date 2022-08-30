package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class CalismaSetMethodu {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of("kalem","silgi","defter"));

        System.out.println(list);

        String eski="silgi";
        String yeni="kalemlik";

        List<String> eskiUrunler = new ArrayList<String>();

      int temp=list.indexOf(eski);
      String silinenUrun=list.set(temp,yeni);

      eskiUrunler.add(silinenUrun);

        System.out.println(list);
        System.out.println(eskiUrunler);


        list.add("canta");
        list.add("kalemtras");
        System.out.println(list);

        String silUrun="kalem";
        int temp1=list.indexOf(silUrun);

        list.set(temp1,"suluk");
        System.out.println(list);

        eskiUrunler.add(silUrun);
        System.out.println(eskiUrunler);







    }




}
