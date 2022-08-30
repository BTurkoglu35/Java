package day26_Construtor;

public class Kamyon {
    public String marka="marka belirtilmedi";
    public String model="model belirtilmedi";
    public int yil;
    public int fiyat;


    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        /*
        bizim temel amacimiz kamyon runner da argument olarak  girilen degerin
        kamyon class inda instance variable' a atanmasi

        ancak scope konusunda ogrendigimiz gibi kamyon constrooctor scope'unda marka
        oldugu icin instance marka ya girmiyor

        bu karisikligi gidermek icin instnace variable'lari belirli hale getirmemiz lazim
        java bu karisikligi onlemek icin this keywordu olusturmustur

        genen kullanim acisindan this keyword'u  kodu herkesin anlamasini kolaylastirdigi
        icin tercih edilir
         */
        
        
    }
    public Kamyon(){
        
    }


    @Override
    public String toString() {
        return
                "marka = " + marka +
                "\n model = " + model +
                "\n yil = " + yil +
                "\n fiyat = " + fiyat ;
    }
}
