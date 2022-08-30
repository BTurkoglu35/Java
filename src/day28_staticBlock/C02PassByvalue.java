package day28_staticBlock;

public class C02PassByvalue {

    public static void main(String[] args) {

        int satisFiyati=100;
        System.out.println(indirimliFiyat(satisFiyati));//90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiyat(satisFiyati));//90

       //iki farkli metodda satis fiyati isminde variable olabilir.
       //java buna itiraz etmez cunku scoplari farklidir
    }


    public static double indirimliFiyat(double orjinalFiyat){
        //metodumuz %10 indirim yapip
        //yeni fiat main methoda dondursun
        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;
    }
}
