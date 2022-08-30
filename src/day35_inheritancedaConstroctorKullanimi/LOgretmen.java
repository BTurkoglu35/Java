package day35_inheritancedaConstroctorKullanimi;

public class LOgretmen {

    LOgretmen() {

        System.out.println("LOgretmen parametrsiz cons");
    }

    LOgretmen(String isim){

        this();
        System.out.println("LOgretmen parametreli cons");
    }

}
