package day14_methodCreation;

import day13_methodCreation.C04_methodcreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen isim ve soyismi
        //ilk harfi buyuk geriy kalsn hsrfler * olacak sekilde
        //I*** K*** seklinde yazdiran bir method olustrun

        String isim = "Enes";
        String soyisim="Bozkurt";
        isimGizle(isim, soyisim);



    }

    public static void isimGizle(String isim, String soyisim) {
    isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
    soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+ "  " +soyisim);


    }
}
