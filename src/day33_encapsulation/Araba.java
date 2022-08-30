package day33_encapsulation;

public class Araba {
    String marka ="marka belirtilmedi";//markanin access modifier'i default access modifier
                                      // oldugundan package icerisind kullanilabilir.
    private  String model="model belirtilmedi";
    private String yakit="elektirikli";
//private yaptigimiz model ve yakit variabllarina erisimi yetkilendirielim
    //modele deger atanabilsin ama gorulemesin(setter)
    //yakit ise gorulebilsin ama yeni deger atanamasin isteniyor(getter)
    public String getYakit() {
        return yakit;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
