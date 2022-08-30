package day33_encapsulation;

public class TasitRunner {
    public static void main(String[] args) {
        Tasit tasit1=new Tasit();
        tasit1.setTasitTuru("tir");


        System.out.println(tasit1.getTasitTuru());
        tasit1.setMuayenesiVarMi(true);
        System.out.println(tasit1.isMuayenesiVarMi());
    }
}
