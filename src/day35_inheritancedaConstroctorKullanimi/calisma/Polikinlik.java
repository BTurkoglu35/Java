package day35_inheritancedaConstroctorKullanimi.calisma;

public class Polikinlik extends Sube{
  //  protected String isim="sube1 polikinlik";
    protected int doktorSayisi=4;

    public Polikinlik(String isim) {
     super(isim);
        System.out.println(isim);
    }

    public Polikinlik() {
        System.out.println("polikinlik merkez");
    }

    public static void main(String[] args) {

        //Polikinlik as=new Polikinlik("merve");
  // Sube as1=new Sube();
  //Polikinlik as1=new Polikinlik();

   Sube as2=new Sube();




}}
