package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 indirimli fiyati hesaplayip retorn eden bir metot olusturun

         */


        double satisFiyati=100;
        double indirimOrani=25;
        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati,double inirimOrani) {

     double indirimliFiyat=satisFiyati*0.75;

     return indirimliFiyat;

    }

}
