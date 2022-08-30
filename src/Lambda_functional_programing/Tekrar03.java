package Lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tekrar03 {
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

        tumElemanlariBuyukHarfIleYazdir(liste);
        System.out.println();
        elemanlariUzunluklarinaGoreSirala(liste);
        System.out.println();
        uzunluklarinGoreTersSiralayipYazdirma(liste);
        System.out.println();
        elemanlariSonKarakterlerineGoreSirala(liste);
        System.out.println();
        elemanlariUzunluklarinaGoreVeIlkKaraktereGoreSirala(liste);
        System.out.println();
      // uzunlugu5TenBuyukElemanlariSilen(liste);
      //  aIleBaslayanNIleBitenElemanlariSilen(liste);
      //  uzunlugu8Ile10ArasindaOLanYadaOIleBiten(liste);
        System.out.println(tumElemanlarinUzunluklari12DenAzMi(liste));
        System.out.println(hicbirElemanXIleBaslamiyorMu(liste));
        System.out.println(herhangiBirElemanRIleBitiyorMu(liste));

    }
    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.

    public static void tumElemanlariBuyukHarfIleYazdir(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
     public static void elemanlariUzunluklarinaGoreSirala(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
     }

     //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun

    public static void uzunluklarinGoreTersSiralayipYazdirma(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void elemanlariSonKarakterlerineGoreSirala(List<String>list){
        list.stream().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5)elemanlari once uzunluklarina gore ve sonre ilk karakterlerine gore siralayip yazdiran bir method olusturun

    public static void elemanlariUzunluklarinaGoreVeIlkKaraktereGoreSirala(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

//   public static void uzunlugu5TenBuyukElemanlariSilen(List<String> list){
//       list.removeIf(t->t.length()>5);
//       System.out.println(list);}

    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
 //  public static void aIleBaslayanNIleBitenElemanlariSilen(List<String>list){
 //      System.out.println(list.removeIf(t -> t.startsWith("A") || t.startsWith("a")&&t.endsWith("N")||t.endsWith("n")));
 //      System.out.println(list);

 //  }

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
//   public static void uzunlugu8Ile10ArasindaOLanYadaOIleBiten(List<String> list) {
//       list.removeIf(t->t.length()>7 &&t.length()<11||t.endsWith("o"));
//       System.out.println(list);
// }

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean tumElemanlarinUzunluklari12DenAzMi(List<String>list){
       return list.stream().allMatch(t->t.length()<12);
    }

    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean hicbirElemanXIleBaslamiyorMu(List<String> list){
        return list.stream().noneMatch(t->t.startsWith("X"));
    }

    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public static boolean herhangiBirElemanRIleBitiyorMu(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }






}
