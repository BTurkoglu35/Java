package day33_encapsulation;

public class Ogretmen {
    String isim;
    String soyIsim;
    String brans;

    /*
    bazende yertkilri sinirlamak degilde yaplina isi daha iyi
    tanimlamak icn encapsulation kullannilir.

    bu yaklsimi kulllanan classlarda  tum variablle'lar private yapilip
    hepsi icin getter ve setter olusturulur.
     */

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public String getBrans() {
        return brans;
    }
}
