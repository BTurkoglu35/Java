package day36_inheritanceDataTimeKullanimi.Calismalar;

public class Merkez extends  Depo {
    protected String kabulEdenIsim="isim belirtilmedi";
    protected int kutuAdet=85;
    protected  String kargoKabulGunu="sali";

    protected void urunKontrol() {
        System.out.println("urunler teslim alinirkem tek tek kontrol edildi");
    }
    protected  void hataliUrun(){
        System.out.println("hatali urunler depoya gonderildi");
    }
    protected void urunSiniflandirma(){
        System.out.println("urunler subeler gonderilmek uzere siniflandirildi");
    }

}
