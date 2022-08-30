package day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim= "Süleyman";
        String soyisim= "Karanfil";
        String kartNo= "1234 6589 7458 9658";

        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // dosya

        System.out.println(isim.substring(2,4)); // le

        // isim ve soyismin ilk harfi büyük harf, kalanlarda *
        // kredi kartının ilk 4 rakamı gorunsun hayatta kalan *

        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +
                kkIlk4+kkGeriyeKalanlar );



    }
}
