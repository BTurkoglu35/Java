package day29_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        bir list olusutrlim
        iki ayri methoddan birine sadece elemanlari degistirelim

        digerinde yeni bir list atayip eleman ekleyelim

        ve her iki method call'dan sonra kendi listemizi
        main method icerisinde kontrol edelim
         */

        List<String> list = new ArrayList<>();
        list.add("ali");
        list.add("veli");
        list.add("can");

        System.out.println("ilk basta list: " + list);
        elemnalriDegistir(list);
        System.out.println("eleman degistir methodundsn sonra list: " + list);
        // [ Oguz, Murat, Fatih]

         listDegistir(list);
        System.out.println("list degistir methodundan sonra  list" +
                "; " + list);
        // [ Oguz, Murat, Fatih]

    }

    public static void listDegistir(List<String> list) {
       list= new ArrayList<>();
       list.add("nutella");
       list.add("cay");
       list.add("cokokrem");

        System.out.println("listDegistir methodunda list "+list); // [Nutella, Cay, Cokokrem]
        // [ Oguz, Murat, Fatih]



   }
   public static void elemnalriDegistir(List<String> list) {
        list.set(0,"oguz");
        list.set(1,"murat");
        list.set(2,"sefa");



    }
}
