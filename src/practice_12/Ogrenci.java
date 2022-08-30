package practice_12;

public class Ogrenci extends  Kisi {
    private  String ogrenciNo;
    private String sinif;


     public Ogrenci(){

    }

    public Ogrenci(String isimSoyisim, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(isimSoyisim, yas,kimlikNo);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }



    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return
                "\nogrenciNo= " + ogrenciNo +
                "\nsinif= " + sinif
                +super.toString();
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }
}
