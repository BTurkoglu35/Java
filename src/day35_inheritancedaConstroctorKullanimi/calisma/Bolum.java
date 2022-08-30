package day35_inheritancedaConstroctorKullanimi.calisma;

public class Bolum extends Fakulte {

    public Bolum(String isim) {
        this();
        System.out.println("bolum parametreli cons");
    }

    public Bolum() {

        System.out.println("bolum parametresiz cons");
    }

    public static void main(String[] args) {
       // Fakulte obj1=new Fakulte();
      //  Bolum obj2=new Bolum("sinif");
        Universite obj3=new Universite();

    }















}





