package day25_constructor;

public class Ogretmen {

    String isim="isim belrtilmemis";
    String soyisim="soyisim belrtilmemis";
    String dogumTarihi="dogumTarihi belrtilmemis";
    String brans="brans belrtilmemis";
    String yanBrans="yanBrans belrtilmemis";

    public Ogretmen(){}

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim = " + isim  +
                "\nsoyisim = " + soyisim +
                "\ndogumTarihi = " + dogumTarihi +
                "\n brans = " + brans +
                "\nyanBrans = " + yanBrans ;

    }
}
