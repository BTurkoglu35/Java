package day26_Construtor;

public class HastaneRunner {
    public static void main(String[] args) {

        Hastane randevu = new Hastane();
        System.out.println(randevu.toString());

        Hastane randevu1=new Hastane("era","goz","meltem sel","01/07/2020");
        System.out.println(randevu1.toString());


        Hastane randevu2=new Hastane("goz","01/07/2022");
        System.out.println(randevu2.toString());
        System.out.println("********");

        Hastane randevu3=new Hastane("cebeci");



    }
}