package day34_inheritance;

public class Toyota {

    protected String marka="Toyota";
    protected String model="Model belirtilmedi";
    protected String yakit="yakit belirtilmedi";


    protected  void motor(){
        System.out.println("toyota cevreci motorlar kullanir");
    }
    protected  void aku(){
        System.out.println("toyota modele gore aku belirler");
    }
}
