package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Notlar {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("kalem", "silgi", "defter"));
        System.out.println(list);

        List<String> meyveler = new ArrayList<>(List.of("elma", "armut", "marul", "domates"));
        System.out.println(meyveler);


        ArrayList<Integer> nums = new ArrayList<>(Collections.nCopies(10, 5));
        System.out.println("nums : 10 tane 5 den oluşan arrayList :" + nums);//[5,5,5,5,5,5,5,5,5,5] 10 tane 5 den oluşan arrayList


      //  subList(int fromIndex, int toIndex)

        ArrayList<Integer> listParcasi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 18, 9));
        System.out.println(listParcasi);

        // list.subList(2,5); 2. index dahil, 5. index haric
        System.out.println("2. index dahil, 5. index haric parcası alındı : " + listParcasi.subList(2, 5));// 3. 4.5 elemanı alır. 5 . eleman alınmaz


        // yeni bir yeniList arrayList'i list.subList() ile de tanimlanabilir
        ArrayList<Integer> yeniList = new ArrayList<>(listParcasi.subList(4, 8));

        //Collections.reverse()
        System.out.println("******** List'teki elemanları düzenli tersten sıralama : Collections.reverse() *********");
        List<Integer> listSayilar = new ArrayList<>(List.of(1,2,6,5,4,7,8));
        Collections.reverse(listSayilar);
        System.out.println("listSayilar'daki elemanları düzenli tersten sıralaması  = " + listSayilar + "\n");

        //****ÇOOOK ÖNEMLİ....Collections.reverse()--> methodu listteki elemanları index sırasına göre tersten sıralar.


        //Collections.max, Collections.min
        System.out.println("******** List'teki elemanları max min elemanını bulma : Collections.max/min() *********");
        System.out.println("listSayilar deki en büyük sayı = " + Collections.max(listSayilar));
        System.out.println("listSayilar deki en küçük sayı = " + Collections.min(listSayilar) + "\n");


        //Collections.fill(listSayilar,8)  listteki tum elemanlara ayni degeri atama
        System.out.println("******** List'teki elemanlara aynı değeri atama : Collections.fill() *********");
        Collections.fill(listSayilar, 8);
        System.out.println("listSayilar'a tüm elemanlara 8 atanadı = " + listSayilar + "\n");


        //asList
        //asList() methodu array'leri list'e cevirmek icin kullanilir.
        //asList() methodu parametre olarak array'in ismini kabul eder.

        String arr2[] = {"Aliye", "Canan"};

        List<String> list1 = Arrays.asList(arr2);
        System.out.println(list1);//[Aliye, Canan]


        //Çook önemli....
        // Array'den list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak
        //esnek degildir.Yani array'den olusturdugunuz list'e ekleme ve cikarma yapamazsiniz.
        //list1.add("Emine");//add() yapamazsiniz.Run Time Error verir."UnsupportedOperationException"

    }
}