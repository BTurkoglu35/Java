package day33_encapsulation;

public class Bina {
    private String adi;
    private String rengi;
    private int yil;
    private boolean depremeDayanikliMi;


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public boolean isDepremeDayanikliMi() {
        return depremeDayanikliMi;
    }

    public void setDepremeDayanikliMi(boolean depremeDayanikliMi) {
        this.depremeDayanikliMi = depremeDayanikliMi;
    }
}