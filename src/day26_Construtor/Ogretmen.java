package day26_Construtor;

public class Ogretmen {
    String name="name belirtilmedi";
    String  soyIsim="soyIsim belirtilmedi";
    String brans="brans belirtilmedi";
    int yas;


    public Ogretmen(String name, String soyIsim, String brans, int yas) {


        this.name = name;
        this.soyIsim = soyIsim;
        this.brans = brans;
        this.yas = yas;
    }

    public Ogretmen() {
        System.out.println("prametresiz calisti");
    }

    public Ogretmen(String name, String soyIsim, String brans) {
this("mehmet","kelleci","resim",4);
        this.name = name;
        this.soyIsim = soyIsim;
        this.brans = brans;
    }

    @Override
    public String toString() {
        return
                "\n name= " + name +
                "\n soyIsim= " + soyIsim +
                "\n brans= " + brans +
                "\n yas= " + yas ;

    }
}

