package Lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tekrar01 {
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

        listElemanlariniYAzdir(liste);
        System.out.println();
        ciftElemalariYazdir(liste);
        System.out.println();
        tekElemanlariniYazdir(liste);
        System.out.println();
        tekElemanlarinKupleriniTekrarsizYazdirma(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKarelerininToplami(liste);
        tekrarsızCiftElemanlarinKuplerininCarpimi(liste);
        enBuyukDegeriBul(liste);
        enKucukDegeriBul(liste);
        get7DenBuyukEnKucukCiftDeger(liste);
      tersSiralamaIle5TenBuyukElemanlarinYariDegerleriniYazdirma(liste);

    }


    //list elemnlarnii yazdir
    public static void listElemanlariniYAzdir(List<Integer> list){
        list.stream().forEach(each -> System.out.print(each+" "));
    }

    //)2)  cift list elemanlarini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional)

    public static void ciftElemalariYazdir(List<Integer> list) {
        list.stream().filter(t->t%2==0).forEach(each -> System.out.print(each+" "));
    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlariniYazdir(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(each -> System.out.print(each+" "));
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekElemanlarinKupleriniTekrarsizYazdirma(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKarelerininToplami(List<Integer> list){
      Integer toplam=  list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsızCiftElemanlarinKuplerininCarpimi(List<Integer> list){
        Integer carpim=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void enBuyukDegeriBul(List<Integer> list){
    Integer max=    list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println(max);
    }

    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun

    public static void enKucukDegeriBul(List<Integer> list){
        int min=list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void get7DenBuyukEnKucukCiftDeger(List<Integer> list){
        Integer deger= list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(deger);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaIle5TenBuyukElemanlarinYariDegerleriniYazdirma(List<Integer> list) {
     List<Double>sonuc=  list.stream().distinct().filter(t->t>5).sorted(Comparator.reverseOrder()).map(t ->t/2.0).collect(Collectors.toList());
        System.out.println(sonuc);

    }














}
