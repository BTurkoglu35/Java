package day36_inheritanceDataTimeKullanimi;

import java.util.ArrayList;

public class CMemur extends  BMuhasebe{
   protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected   void maas(){
        System.out.println("memurlar :"+(30*saatUcreti*gunlukMesai)+"maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("memurlar %60 indirimli ozel sigorta yaptirilabilr");

    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();//personel
        System.out.println(mmr1.isim);//personel
        System.out.println(mmr1.souIsim);//personel
        System.out.println(mmr1.departman);//personel

        BMuhasebe mhsb1=new BMuhasebe();
        /*
        her ne kadar memur classinin icinde olsak da olusturdugumuz obje
        muhasebe classindan
        cunku data turu ve consructor BMuhasebe


        String str="murat";
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer sayi=20;
        Bmuhasebe classi da obje olusturulabilen bir classdir yani data turudur'
        obje olusturduguuz her class ayni zamanda data turudur
         */


        System.out.println(mhsb1.gunlukMesai);//8
        System.out.println(mhsb1.saatUcreti);//10
        mhsb1.maas();//muhasebe
        mhsb1.ozelSigorta();//muhasebe
        mhsb1.sigorta();//personel
        System.out.println(mhsb1.isim);//personel
        System.out.println(mhsb1.souIsim);//personel
        System.out.println(mhsb1.departman);//personel






    }




}
