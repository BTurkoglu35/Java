package day48_mapsTheAnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListesiMap=ReusableMethods.mapOlustur();
        sinifListesiMap.clear();
        System.out.println("cleardan sonra map"+sinifListesiMap);
        ReusableMethods.entryYAzdir(sinifListesiMap);

        sinifListesiMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListesiMap.getOrDefault(104,"aradigniz key yok"));//Derya,deniz,tester

        System.out.println(sinifListesiMap.getOrDefault(110,"aradigniz key yok"));///aradigniz key yok

        System.out.println(sinifListesiMap.isEmpty());//false

        sinifListesiMap.putIfAbsent(104,"derya, okyanus,developar");
        sinifListesiMap.putIfAbsent(108,"aysun,can,devops");
        ReusableMethods.entryYAzdir(sinifListesiMap);

      /*
        siinif listesiMap'e key olarak 106 yoksa ,value  "mevlut,han,tester"
      //106 daha onceden varsa ,eskiden var olan datayi degistirmek istediginnizden eminmisinz yazdirin
      106'nin kontrol etmek icin containsKey daha mantikli ama biz yeni ogrendigimiz method ile yapalim

      map.putIfAbsent (key,value)==> key varsa
      ekleme yapmaz, bize o key ile kayitli olan vale'yu dondurur
      ==. key daha once map'e eklenmemisse eklemeyi yapar ve bize null dondurur
      */

        if(sinifListesiMap.putIfAbsent(106,"mevlut, han,tester")==null){
            System.out.println("kayit basarili");
        }else{
            System.out.println("eski degeri degistirmek istediginizden emin misniz");
        }
        ReusableMethods.entryYAzdir(sinifListesiMap);


        sinifListesiMap.remove(106);//106 yi silip bana sildigini dondurur
        sinifListesiMap.remove(107,"Hamza,eren,JDev");//silerse true ,silmezse false dondurur

        ReusableMethods.entryYAzdir(sinifListesiMap);

        sinifListesiMap.replace(105,"erdal,ciftci,tester");
        sinifListesiMap.put(108,"Cavidan,eken,JDev");//ikisi ayni islevi yapiyor



        ReusableMethods.entryYAzdir(sinifListesiMap);

        System.out.println(sinifListesiMap.size());//6


    }
}
