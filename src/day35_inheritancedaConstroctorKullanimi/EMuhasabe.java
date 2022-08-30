package day35_inheritancedaConstroctorKullanimi;

public class EMuhasabe extends DPersonel {
    EMuhasabe() {

        System.out.println("muhasabe parametresiz cons.");

    }

    EMuhasabe(String isim) {

        System.out.println("muhasabe parametreli cons");

    }
}
