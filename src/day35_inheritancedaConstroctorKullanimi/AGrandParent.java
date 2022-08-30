package day35_inheritancedaConstroctorKullanimi;

public class AGrandParent {
    protected  String isim="Grandpa ismi belirtilmedi";
    /*
    her class da gorunmese bile bir constructor vardir.
    bu class'dan obje olustrumak istedigimizde default constructor devreye girecektir.
    Default constructor' gozlemleyemeyecegimiz icin
    onun yerine kullanilabilecek parametresiz constructor olusturalim.

     */

    protected String granpaKlupAdi = "Granpa klubu";

    AGrandParent(){

        System.out.println("AGrandParent contructor calisti");
    }

}
