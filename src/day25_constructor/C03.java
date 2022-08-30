package day25_constructor;

public class C03 {
     /*
     proje olusturuken bazi classlar run etmek icin degil variable ve method
     olusturup bunlari baska classlardan kullanmak icin olusturulur
      */
     /*
     default constructor parametresizdir, goremesek bile ihtiyac oldugunda calisir

     class icerisinde parametreli veya parametresiz herhangi bir constructor
     olusturusak java default constructori siler
      */

     C03(){

     }
     /*
     olusturdugumuz parametresiz bu constructor default constructor ile birebir aynidir
     ama biz olusturdugumuz ucun buna default constructor demeyiz
     parametresiz constructor deriz.
      */
    public String isim="Etka";

     public void method01(){
          System.out.println("C03 method calisti");
     }




}
