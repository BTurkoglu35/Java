package Lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    /*
   1) t-> "Logic" , (t,u)->"logic" ==>bu yapiya "lambda expression" denir.
    2) Functional_programing kapsaminda  "lambda expression" kullanilabilir ama onerilmez.
    "lambda expression" yerine "method reference" tercih edilir.
    3)Method_reference kullanimi "Class name :: Method Name"

     Ayni zamanda kendi classlarinizida kullanabilirsiniz.
     Ornegin bir animal classiniz var ve buclasss "eat()" methoduna sahip==>"Animal::eat()"
     */
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

        listElemeanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElememanlarinKareleriToplami(liste);
        tekrarsizCiftElememanlarinKareleriToplami2(liste);
        tekrarsizCiftElememanlarinKareleriToplami3(liste);
        tekrarsizCiftElemanlariKuplerininCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMinimum(liste);
        tekrarsizBestenBuyukElemanlarinYariDegerleri(liste);


    }
    //) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional ve method reference)

    public static void listElemeanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //)2)  cift list elemanlarini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    // 4)ardisik tek list elemanlarının kuplerini tekrarsiz olarak ayni satirda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElememanlarinKareleriToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }

    //2.yol
    public static void tekrarsizCiftElememanlarinKareleriToplami2(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
        System.out.println(toplam);
    }

    //3.yol
    public static void tekrarsizCiftElememanlarinKareleriToplami3(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Integer::sum);
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun

    public static void tekrarsizCiftElemanlariKuplerininCarpimi(List<Integer> list) {
        Integer carpimSonuc = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println(carpimSonuc);

    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void enKucukDeger(List<Integer> list) {
        Integer min = list.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMinimum(List<Integer> list) {
        Integer minYedidenBuyuk = list.stream().distinct().filter(t -> t > 7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();

        System.out.println(minYedidenBuyuk);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tekrarsizBestenBuyukElemanlarinYariDegerleri(List<Integer> list) {
        List<Double> yeniList = list.
                stream().//gerekli methodlari kullanmamiizi saglar
                        distinct().//tekrrli elemanlarin birini siler
                        filter(t -> t > 5).//
                        map(Utils::yariAl).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(yeniList);
    }


}