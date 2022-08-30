package practice_12;

public class Ogretmen extends Kisi {


    private String bolum;
    private String sicilNo;

    public Ogretmen(){
    }

    public Ogretmen(String isimSoyisim,String kimlikNo, int yas, String bolum, String sicilNo) {
        super(isimSoyisim, yas,kimlikNo);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    @Override
    public String toString() {
        return
                "\n bolum= " + bolum +
                "\nsicilNo= " + sicilNo
                +super.toString();
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
}
