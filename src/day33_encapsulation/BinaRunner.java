package day33_encapsulation;

public class BinaRunner {
    public static void main(String[] args) {
        Bina bina1=new Bina();
     bina1.setAdi("zafer");
     bina1.setRengi("beyaz");
     bina1.setYil(5);
     bina1.setDepremeDayanikliMi(true);

        System.out.println(bina1.getAdi());
        System.out.println(bina1.getRengi());
        System.out.println(bina1.getYil());
        System.out.println(bina1.isDepremeDayanikliMi());


    }
}
