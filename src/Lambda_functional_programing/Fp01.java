package Lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1)Lambda (functional programnig) java 8 ile kullanilmaya baslanmistir.
    2)Functional programnig'de "ne yapilacak "(what to do) uzerine yogunlasir.Structured Programing "Nasil yapilacak"(how to do) uzerine yogunlasir.
    3)Functional programnig arrays ve collections ile kullanilir.
    4)2EntrySet() methodu ile map sete donusturulerek functional_programing'de kullanilabilir
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

        //) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        CiftElemanlariYazdirStructered(liste);
        System.out.println();
        ciftElemanlariniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsizElemanlarinKupleriFunctional(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        enBuyukElememaniYazdirma(liste);
        enBuyukElememaniYazdirma02(liste);
        enBuyukElemaniYazdirma(liste);
        yedidenKucukMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSıralamaylaTekrarsizElemanlarinYarisi(liste);


    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer each : list) {
            System.out.print(each + " ");
        }
    }

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
        //stream() methodu collection'dan elementleri akisa dahil etmek icin ve emthodlara ulasmak icin kullanilir.


    }

    //)2)  cift list elemanlarini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void CiftElemanlariYazdirStructered(List<Integer> list) {
        for (Integer each : list) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
            }
        }

    }
    //)2)  cift list elemanlarini  aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional)

    public static void ciftElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

        //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)



        }
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {

     list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t -> System.out.print(t + " "));
    //elemanlarin degerleri degisecekse map methodu kullanilir.
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

      public static void tekrarsizElemanlarinKupleriFunctional(List<Integer> list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t -> System.out.print(t + " "));

          }
          //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

        public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

            Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
            System.out.println(toplam);
        }

            //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

           public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){

       int carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
               System.out.println(carpim);
           }

         //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

           //1.yol

        public static void enBuyukElememaniYazdirma(List<Integer> list) {

            Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
            System.out.println(max);

        }
        //2.yol
         public static void enBuyukElememaniYazdirma02(List<Integer> list) {

             Integer max2 = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);

             System.out.println(max2);

         }
         //Ödev
         //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void enBuyukElemaniYazdirma(List<Integer> list) {

        Integer min= list.stream().distinct().reduce(list.get(0), (t,u) ->t<u ?t:u);
        System.out.println(min);

    }


        //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenKucukMin(List<Integer> list){

     Integer minYedi=   list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE, (t, u) -> t<u ? t:u);
        System.out.println(minYedi);
    }

    //2.yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list) {
      Integer min= list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) ->u);
        System.out.println(min);
    }

    //3.yol
    public static void getYedidenBuyukCiftMin3(List<Integer> list) {
      Integer min=  list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

     public static void getTersSıralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {

      List<Double>sonuc=list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         System.out.println(sonuc);

     }


}



