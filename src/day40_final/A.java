package day40_final;

  public class A {
    protected String isim = "Cuneyt";
    final static String OKUL = "Yildiz Koleji";
    /*
    bir variable final olarak tanimlandiysa baska classlardan veya icinde
    bulundugumz classs'dan bu variable'a deger atanmasi mumkun degildir

    madem ki degeri degistirilmiyor genelde static de yaparak]]
  bu variable'a erisim kolaylastirilir


    static final olarak belirlenen variabellarin ismi genede buyuk harfle yazilir.
     */

    final void finalMethod(){
        System.out.println("final methodlar override edilemez");

    /*
     bir methodu final olarak isaretlerseniz o method degistirilemez demektir
     (override edilemez)
     */






    }


}
