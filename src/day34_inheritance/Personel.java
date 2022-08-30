package day34_inheritance;

public class Personel {
    /*
    eger parent class olacak sekilde tasarladiginiz bir  class varsa veya ileride
    bu claasi parent yapmak isteyenler olabilir diyorsaniz variable ve methodlarin
    access modifier'ini protected
     */

    protected int persNo;
    protected String isim="Isim belrtilmedi";
    protected  String departman="Departman belrtilmedi";


    protected  void maas(){
        System.out.println("Tum personelin maasi vardir");

    }
    protected void mesai(){

        System.out.println("Tum personel statuseune gore mesai yapar");
    }

    protected void fazlamesaiucreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");

    }



}
