package day36_inheritanceDataTimeKullanimi;

import day34_inheritance.Personel;

import java.util.*;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected   void maasIsci(){
        System.out.println("isciler :"+(30*saatUcreti*gunlukMesai)+"maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("isciler %70 indirimli ozel sigorta yaptirilabilr");

    }

    public static <APersonel> void main(String[] args) {
        BMuhasebe isci1=new DIsci();
        /*
        bir obje olusturulurkne data turu ve consructor ayni class'dan ise
        direk o class'a gidiyorduk

        eger data turu ve consructor farkli ise obje consructor'in oldugu classin objesidir
        ancak,bizden istenen isci classinda ki spesifik ozellikler degil bir iscinin muhasebe
        classindaki tum calisanlarla saip oldugu genel ozellikleri yazdirir.

         */
        System.out.println(isci1.gunlukMesai);//muhasebe 8
        System.out.println(isci1.saatUcreti);//Muhasebe 10
        isci1.maas();//muhasebe
        isci1.ozelSigorta();//isci
        isci1.sigorta();//personel
        System.out.println(isci1.isim);//personel
        System.out.println(isci1.souIsim);//personel
        System.out.println(isci1.departman);//personel


       Apersonel isc2=new DIsci();
      // System.out.println(isc2.gunlukMesai);//muhasebe 8
      //  System.out.println(isc2.saatUcreti);//Muhasebe 10
        isc2.maas();//muhasebe
     //   isc2.ozelSigorta();//Muhasebe
        isc2.sigorta();//personel
        System.out.println(isc2.isim);//personel
        System.out.println(isc2.souIsim);//personel
        System.out.println(isc2.departman);//personel
        /* eger data turu olan classta aradigimiz ozelllik yoksa
        onun parentine gidebilir
        ama childa donus olamaz
        aradigi ozelligi bulamazsa cte verir
         */

      List<String> list = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();

        /*
        hepsi linkedList olsa da list1 list gibi davranir
        list2 deque gibi davranir
        list3 Queue gibi davranir
         */
    }
}
