package day33_encapsulation;

public class Hastane {


    private String isim;
    private String polikinlikIsmi;
    private String RandevuTarihi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getPolikinlikIsmi() {
        return polikinlikIsmi;
    }

    public void setPolikinlikIsmi(String polikinlikIsmi) {
        this.polikinlikIsmi = polikinlikIsmi;
    }

    public String getRandevuTarihi() {
        return RandevuTarihi;
    }

    public void setRandevuTarihi(String randevuTarihi) {
        RandevuTarihi = randevuTarihi;
    }

    public boolean isRahatsizlikVarMi() {

        return rahatsizlikVarMi;
    }

    public void setRahatsizlikVarMi(
            boolean rahatsizlikVarMi) {
        this.rahatsizlikVarMi = rahatsizlikVarMi;
    }

    private boolean rahatsizlikVarMi;
}


