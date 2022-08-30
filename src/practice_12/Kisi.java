package practice_12;

public class Kisi {
   private String isimSoyisim="";

   private int yas;//herkesin ortak ozelligi
    private String kimlikNo="";

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setIsim(String isim) {
        this.isimSoyisim = isimSoyisim;
    }



    @Override
    public String toString() {
        return
                " \nisim=" + isimSoyisim+

                "\nyas=" + yas +
                "\nkimlikNo="+kimlikNo;

    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }



    public int getYas() {
        return yas;
    }

    public Kisi() {
    }

    public Kisi(String isimSoyisim,  int yas,String kimlikNo) {
        this.isimSoyisim = isimSoyisim;
        this.yas = yas;
        this.kimlikNo = kimlikNo;
    }
}
