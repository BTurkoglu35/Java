package Lambda_functional_programing;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

public class Tekrar02 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        ardisikListElemanlariniAyniSatirdaAralarindaBoslukBirakarakYazdir(liste);
        System.out.println();
        ciftElemanlariniAyniSatirdaBosluklaYazdir(liste);
        System.out.println();
        ardisikTekListElemanlarininkareleriniYazdir(liste);
        System.out.println();
        ardisikTekListElemanlarinKupleriniTekrarsizYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKarelerininToplami(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        enBuyukDegeriYazdir(liste);
        enKucukDeger(liste);
        get7DenBuyukEnKucukCiftSayiBul(liste);
        tersSiralamaIleTekrarsiz5TenBuyuELemanlarinYarisiniYazdir(liste);



    }
    //) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional ve method reference)

    public static void ardisikListElemanlariniAyniSatirdaAralarindaBoslukBirakarakYazdir(List<Integer>list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //)2)  cift list elemanlarini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional)

    public static void ciftElemanlariniAyniSatirdaBosluklaYazdir(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ardisikTekListElemanlarininkareleriniYazdir(List<Integer> list){
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }


    // 4)ardisik tek list elemanlarının kuplerini tekrarsiz olarak ayni satirda aralarında boşluk bırakarak yazdıran bir method oluşturuN

    public static void ardisikTekListElemanlarinKupleriniTekrarsizYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKarelerininToplami(List<Integer> list){
      Integer toplam=  list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println(toplam);
    }


    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void enBuyukDegeriYazdir(List<Integer> list) {
        Integer max=list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

    public static void enKucukDeger(List<Integer> list) {
        Integer min=list.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void get7DenBuyukEnKucukCiftSayiBul(List<Integer> list){
        Integer deger=list.stream().filter(t->t>7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println(deger);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tersSiralamaIleTekrarsiz5TenBuyuELemanlarinYarisiniYazdir(List<Integer> list) {
        list.stream().distinct().filter(t->t>5).map(Utils::yariAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }






}
