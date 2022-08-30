package day35_inheritancedaConstroctorKullanimi.calisma;

public class Sube extends Hastane{

 //   protected String isim="Huzur";

    protected int doktorSayisi=8;


    public Sube() {
       super(polikinlik);
        System.out.println(doktorSayisi);
    }

    public Sube(String isim) {
        this();
        System.out.println("sube cok temiz");
    }
}
