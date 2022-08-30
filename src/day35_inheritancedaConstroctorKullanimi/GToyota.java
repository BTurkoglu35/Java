package day35_inheritancedaConstroctorKullanimi;

public class GToyota {
    protected String name="araba";
    GToyota() {

        System.out.println("GToyota parametresiz cons.");

    }

    GToyota(String isim) {
//super(isim); extends olmadigi icin super cons calismadi
        System.out.println("GToyota parametreli cons");

    }
}
