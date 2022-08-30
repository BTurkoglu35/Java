package day47_maps;

import day46_maps.ReusableMethods;

import java.util.*;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key)==> verdigimiz key'iin map'de olup olmadigini boolean olarak doner
        map.contains(value)==> bir butun olarak value'nun map'de olup olmadigini doner

        ONEMLI NOT: map.contains(value) valuen'nun icindeki bir parcayi bulmada ise yaramaz
        eger value icindeki bir parcati aratmak istiyorsak map uzerunde manipulation yapmamiz lazim

        map.get(key)==> verilen key'e ait degeri dondurur
         */

        Map<Integer,String>sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        System.out.println(sinifListMap);

        System.out.println(sinifListMap.containsKey(104));//true
        System.out.println(sinifListMap.containsKey(114));//false

        System.out.println(sinifListMap.containsValue("Ali,can,JDev"));//true

        System.out.println(sinifListMap.containsValue("JDev"));//false

        //verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        //maplerde replace tum value degistirmek istersek kullanilabilri.Kismi degisikliklerde kullanamayiz.

         ReusableMethods.tumValueSiraliYazdir(sinifListMap);

         //mapi guncelleme yapmak icin key, yenidegeri map'e eklemeliyiz
        //ornegin key 101 icin value Ali,can, JDev
        //guncelleme icin sinifListMap.put(101,"Ali,can,JDev");

        //bunu yapabilmek icin herbir key'e ve ona ait value'ye ihtiyacim var

        Set<Integer> keySeti=sinifListMap.keySet();
        String eachValue;
        for (Integer each : keySeti) {
          eachValue =  sinifListMap.get(each);
          eachValue=eachValue.replace("JDev","JavaDeveloper");
          sinifListMap.put(each, eachValue);
          /*
          biz keylerin tamamini aldik herbir key'in value'sunu getirdik value uzerinde degisiklikligi
          yapip yeni halini put(key,yenideger) ile map'e koyduk
           */
        }
        System.out.println(sinifListMap);


    }

}








