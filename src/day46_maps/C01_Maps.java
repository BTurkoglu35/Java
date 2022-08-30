package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String>sinifList=new HashMap<Integer,String>();

        sinifList.put(101,"Ali,can,JDev");
        sinifList.put(102,"Enes,cem,tester");
        sinifList.put(103,"taha,emre,JDev");
        sinifList.put(104,"Derya,deniz,tester");

        System.out.println(sinifList);//{101=Ali,can,JDev, 102=Enes,caem,tester, 103=taha,emre,JDev, 104=Derya,deniz,tester}

        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[Ali,can,JDev, Enes,caem,tester, taha,emre,JDev, Derya,deniz,tester]

        System.out.println(sinifList.values().size());//4

        //tum ogrencilerin isimlerini ve soyisimlerini  alt alta yazdirin

        Collection<String> tumValueCollection= sinifList.values();

         String[] eachArr;
         int sira=1;
        for (String each:tumValueCollection
             ) {
            //buradaki each bize her bir ogernciye ait ayni yapidaki isim,soyisim,brans bilgilerini iceren Stringler getiriyor
            eachArr=each.split(",");
            System.out.println(sira+" "+eachArr[0]+ " "+eachArr[1]);
            sira++;
        }
          //Map'da bulunan ogrencilerin ,isim ve soyisimlerini birlestirerek
        //bir sinif listesi olsutrun

        List<String> sinifIsimSoyisimList=new ArrayList<>();
        for (String each:tumValueCollection
             ) {
            eachArr=each.split(",");
            sinifIsimSoyisimList.add(eachArr[0]+ " "+eachArr[1]);

        }
        System.out.println(sinifIsimSoyisimList);

    }
}
