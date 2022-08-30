package day35_inheritancedaConstroctorKullanimi;

public class AParent extends AGrandParent {
    protected String isim = "parent sim belirtilmedi";

    protected String parentKlupAdi = "parent klubu";

    AParent() {
        System.out.println("parent constructor calisti");
    }


}
