package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_lists {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        //size
        System.out.println("listenin boyutu: "+sayilar1.size());//3

        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);//[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("listenin yeni boyutu:" +sayilar1.size() );//8

        sayilar1.add(1,9);
        System.out.println(sayilar1);//[5, 9, 3, 2, 2, 5, 3, 2, 2]


        //set (int doner)
        //[5,9, 3, 2, 2, 5, 3, 2, 2]

       sayilar1.set(2,8);

        System.out.println(sayilar1);//[5, 9, 8, 2, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12));//  5 sildigi elemanida getirir
        System.out.println(sayilar1); //[12, 9, 8, 2, 2, 5, 3, 2, 2]

          /*set methodu istenen indexteki eski elemnti silip
          yerine verdigimiz yeni elemnti set eder.

          eger eski elemnti silmek istemiyorsak add(index,deger)
          methodunu kullanabiliriz

          set() methodu sildigi eski elmenti bize dondurur
           */



      //list olusturma

        List<String> isimler=new ArrayList<String>(List.of("Merve","zeynep","ali"));
        isimler.add("mustafa");
        System.out.println(isimler);



        List<Integer> sayilar=new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,8));
        System.out.println(sayilar);
        sayilar.add(9);
        System.out.println(sayilar);



    }
}
