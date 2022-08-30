package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);

        //liste'deki tm elementleri INDEX KULLANMADAN 3 arttirin

        for (Integer each:liste
             ) {

            System.out.println(each+3+"");
        }
        System.out.println(liste);//[10,20,30]
        /*
        java index yapisi olmayayn collection'lardaki elementlere ulasmak veya degistirmek icin
        iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir. Bunu yerine bize iterator donduren
         liste.iterator() kullaniyoruz.
         */

        Iterator it = liste.iterator();
        System.out.println(it.next());//10
        System.out.println(it.next());//20
        System.out.println(it.next());//30
      //  System.out.println(it.next());//30  dan sonra element kalmadigindan next methodu RTE verir.

        //iterator'da geri donus yok, adim adim sona ulastiktan sonra
        //basa gelmek isterseniz yeniden bir iterator olusturmamiz gerekir
//[10,20,30]
        Iterator it2 = liste.iterator();
        //yeni it2 yi kullanaarak listenin tum elementlerini silelim.
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();


        System.out.println(liste);//iterator ile elementleri gezip,remove yapinca liste kalici olarak degisti

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10,20,30]
        Iterator it3 = liste.iterator();
        while (it3.hasNext()) {
            it3.next();
            it3.remove();

        }
        System.out.println(liste);


        /*
       goruldugu gib iterator kullanarak yapabildigim
       1-tum collection elementlerini yazdirmak
       2-tum collection elementlerini silmek
       Buda bize yetmez


     */


    }






}
