package day35_inheritancedaConstroctorKullanimi.calisma;

public class Fakulte extends Universite{
    public Fakulte() {
        System.out.println("Fakulte parametresiz cons");
    }

    public Fakulte(String isim) {

        super(isim);
        System.out.println("Fakulte parametreli cons");
    }
}
