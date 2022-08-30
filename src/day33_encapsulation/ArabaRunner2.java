package day33_encapsulation;

public class ArabaRunner2 {
    public static void main(String[] args) {
        Araba arb2=new Araba();
        arb2.marka="nissan";
        System.out.println(arb2.marka);

        System.out.println(arb2.getYakit());

        arb2.setModel("primera");

    }
}
