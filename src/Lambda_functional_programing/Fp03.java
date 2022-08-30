package Lambda_functional_programing;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfYazdir(liste);
        System.out.println();
       // buyukHarfYazdir2(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunluklarinaGoreTersSiralama(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);
        System.out.println();
        uzunlukVeIlkHarfeZGoreSiralaYazdir(liste);
        System.out.println();
       // uzunluguBestenBuyukleriSil(liste);
     //   baslangiciAYadaSonuNOlaniSil(liste);
      //  baslangiciAYadaSonuNOlaniSil2(liste);
       // uzunlug8Ile10ArasiYadaOIleBiteniSil(liste);
        System.out.println(uzunlugu12denAzMi(liste));
        System.out.println(hicbirElemanXIleBaslamiyorMu(liste));
        System.out.println(rIleBitenVarMi(liste));


    }
    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void  buyukHarfYazdir(List<String>list){
      list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //2.yol

  //  public static void buyukHarfYazdir2(List<String>list){//liste listini kalici olarak degistirir.
  //      list.replaceAll(String::toUpperCase);
  //      System.out.println(list);
//
  //  }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);//comperator comparing: siralama kosulunu belirtmek icin kullanilir.

    }
    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun
    public static void uzunluklarinaGoreTersSiralama(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }


    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }


    //5)elemanlari once uzunluklarina gore ve sonre ilk karakterlerine gore siralayip yazdiran bir method olusturun
    public static void uzunlukVeIlkHarfeZGoreSiralaYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);

        //thenComparing() :==>siralam icin bir kosul daha belirtir
    }
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
  // public static void uzunluguBestenBuyukleriSil(List<String> list) {
  //     list.removeIf(t->t.length()>5);                                 ==>list mutable oldugu icin elemanlari islem sonrasi kalici
  //     System.out.println(list);                                         degistiginden comment out yapiyorum
  // }

      //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
     //1.yol
 //   public static void baslangiciAYadaSonuNOlaniSil(List<String> list) {
 //       list.removeIf(t->t.charAt(0)=='a'||t.charAt(0)=='A'||t.charAt(t.length()-1)=='n'||t.charAt(t.length()-1)=='N');
 //       System.out.println(list);
 //   }

    //2.yol

 //     public static  void baslangiciAYadaSonuNOlaniSil2(List<String> list) {
 //       list.removeIf(t->t.startsWith("a")||t.startsWith("A")||t.endsWith("n")||t.endsWith("N"));
 //         System.out.println(list);
 //   }

    ////8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
  //  public static void uzunlug8Ile10ArasiYadaOIleBiteniSil(List<String> list) {
  //      list.removeIf(t->t.length()>7&&t.length()<11||t.endsWith("o"));
  //      System.out.println(list);
  //  }


    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunlugu12denAzMi(List<String> list){
        return list.stream().allMatch(t->t.length()<12);
                //anyMAtch=?herhangi biri ,    allMatch=> herbiri ,    noneMatch=>hic biri

    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean hicbirElemanXIleBaslamiyorMu(List<String> list){

      return   list.stream().noneMatch(t->t.startsWith("X"));
    }

     //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public  static boolean rIleBitenVarMi(List<String> list){
        return  list.stream().anyMatch(t->t.endsWith("r"));
    }















}
