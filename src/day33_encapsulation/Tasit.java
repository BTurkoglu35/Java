package day33_encapsulation;

public class Tasit {
    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;


    public String getTasitTuru() {

        return tasitTuru;
    }
  //getter methodu da tek bir satirlik islem yapiyor
    //baska classlarin private oldugu icin erisemedigi
    //tasit turu bilgiisni,class icinden alip'
    //istenen farkli class'lar return ediyor
    public void setTasitTuru(String tasitTuru) {

        this.tasitTuru = tasitTuru;
    }

    public boolean isMuayenesiVarMi() {

        return muayenesiVarMi;
    }
    //boolean variable'lar icin olusturulan getter methodu
    //is variable seklinde olur

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {

        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {

        this.yil = yil;
    }



}
