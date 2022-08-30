package day14_methodCreation;

public class Calisma9 {
    public static void main(String[] args) {
        //input olarak verilen isim ve soyismi ilk
        // harfler buyuk geriye kalani
        //yildiz olacak sekilde giriniz
String isim="Enes";
String soyisim="Bozkurt";
isimGizleme(isim,soyisim);
Calisma8.rakamlarToplami(654);

        
    }

    public static void isimGizleme(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).
                replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).
        replaceAll("\\w","*");
        System.out.println(isim+" "+soyisim);


    }
}
