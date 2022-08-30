package day35_inheritancedaConstroctorKullanimi.calisma;

public class Hastane {

    protected String isim="Medical Asude";

    protected int doktorSayisi=16;

     protected static String polikinlik="goz hastaliklari";
    public Hastane() {
        System.out.println("hastane ana sube");
    }

    public Hastane(String isim) {
        System.out.println(isim);
    }
}
