package day26_Construtor;

public class Hastane {

    public String hastaneAdi="belirtilmemis";
    public String pollikinlik="belirtilmemis";
    public String doktorAdi="belirtilmemis";
    public String randevu="belirtilmemis";

    public String randevuVarMi="hayir";

     public Hastane(){

         System.out.println(randevuVarMi);
     }
    public Hastane(String hastaneAdi, String pollikinlik, String doktorAdi, String randevu) {
        this.hastaneAdi = hastaneAdi;
        this.pollikinlik = pollikinlik;
        this.doktorAdi = doktorAdi;
        this.randevu = randevu;
    }

    public Hastane(String pollikinlik, String randevu) {
        this.pollikinlik = pollikinlik;
        this.randevu = randevu;
    }
    public Hastane(String HastaneAdi){

         this();
    }

    @Override
    public String toString() {
        return
                "\nhastaneAdi=" + hastaneAdi +
                "\n pollikinlik=" + pollikinlik +
                "\n doktorAdi=" + doktorAdi +
                "\n randevu=" + randevu ;

    }
}
