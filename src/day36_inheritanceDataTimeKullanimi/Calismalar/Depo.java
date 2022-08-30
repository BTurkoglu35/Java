package day36_inheritanceDataTimeKullanimi.Calismalar;

public class Depo {
    protected String  tur="oyuncak";
    protected  int turAdet;
    protected String kargoGunu="pazartesi";

    protected void urunKontrol(){
        System.out.println("urunler kargodan once kontrol edildi");
    }
    protected void urunSiniflandirma(){
        System.out.println("urunler turlerine paketlendi");
    }
}
