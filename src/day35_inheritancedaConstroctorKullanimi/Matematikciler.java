package day35_inheritancedaConstroctorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler() {
        //    super(); ogretmen parametrsize goturur.
        System.out.println("Matematikciler parametrsiz cons");
    }

    Matematikciler(String isim) {
        this();//icinde buludugun parameteesiz cons'a git
        System.out.println("Matematikciler parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1 = new Matematikciler("tuba");
    }
/*
this() cons call icinde bulunulan class'daki constructor'lari
super() cons call ise parent class'da bulunan constructor'lari cagirir

this() veya super()paeametre yaoisina uygun bir con. bulamazsa
java CTE verir

constructor konusunda gordugumuz this. o classtaki instance  variable'lari
refere ediyordu

inheritance da da super. vardir.
super.parent class'daki instancelari refere eder
 */

}
