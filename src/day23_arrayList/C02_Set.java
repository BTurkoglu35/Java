package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip
        eski urunu ,varolan eski urunler listesine ekleyelim
         */

        List<String> urunler = new ArrayList<String>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        List<String> eskiUrunler = new ArrayList<String>();
        //listedeki ikramin yerine biskrem koyalim
        //ikrami eski urunlr listesine ekleyeklim


        String yeniUrun = "biskrem";
        String silinecekUrun = "ikram";

        int temp = urunler.indexOf(silinecekUrun);//silinecek urunun index'ini temp'e atadik
        String silinenUrun = urunler.set(temp, yeniUrun); //set methodu ile siliencek urunun indexinin yerine yeni urunu koyduk set methodu bize
        //silinen urunu dondurdugu icin onu silinen urun variable'ina atadik


        eskiUrunler.add(silinenUrun);   //set methodu ile sildigimiz urunu add methodu ile eski urunler listesine koyduk

        System.out.println("liste: " + urunler);//[nutella, biskrem, cekirdek, cay]
        System.out.println("eskiUrunler listesi:" + eskiUrunler);//[ikram]


        yeniUrun = "findik";
       // silinecekUrun = "cekirdek";

        temp = urunler.indexOf("cekirdek");
        silinenUrun = urunler.set(temp, yeniUrun);


        eskiUrunler.add(silinenUrun);
        System.out.println("liste: " + urunler);
        System.out.println("eskiUrunler listesi:" + eskiUrunler);


    }
}

