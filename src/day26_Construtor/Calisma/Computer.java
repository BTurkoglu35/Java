package day26_Construtor.Calisma;

public class Computer {
    String isim="isim belirtilmedi";
    String model="model belirtilmedi";
    int uretimYili;
    String uretimYeri;

    public Computer(String isim, int uretimYili) {
        this.isim = isim;
        this.uretimYili = uretimYili;
    }

    public Computer() {
    }



    public Computer(String isim, String model) {

        this.isim = isim;
        this.model = model;
    }

    public Computer(String isim, String model, int uretimYili, String uretimYeri) {
       this(isim, model, uretimYili);
        this.uretimYeri = uretimYeri;
    }



    public Computer(String isim, String model, int uretimYili) {
        this(isim,model);
        this.uretimYili = uretimYili;
    }



    @Override
    public String toString() {
        return
                "\n isim= " + isim +
                "\n model= " + model +
                "\n uretimYeri" + uretimYili +
                "\n uretimYeri= " + uretimYeri ;
    }
}
