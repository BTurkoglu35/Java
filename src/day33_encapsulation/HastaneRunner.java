package day33_encapsulation;

public class HastaneRunner {
    public static void main(String[] args) {


        Hastane hasta = new Hastane();
        hasta.setIsim("meral");
        hasta.setPolikinlikIsmi("goz");
        hasta.setRandevuTarihi("28/06/20");
        hasta.setRahatsizlikVarMi(false);

        System.out.println(hasta.getIsim()+"\n"+hasta.getPolikinlikIsmi()+"\n"+hasta.getPolikinlikIsmi()+"\n"+hasta.isRahatsizlikVarMi());



    }

}
