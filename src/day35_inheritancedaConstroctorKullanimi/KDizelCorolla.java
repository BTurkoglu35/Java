package day35_inheritancedaConstroctorKullanimi;

public class KDizelCorolla extends HCorolla {
    KDizelCorolla() {

        System.out.println("KDizelCorolla  parametresiz cons.");

    }

    KDizelCorolla(String isim) {
        super(isim);
        System.out.println("KDizelCorolla parametreli cons");

    }

    public static void main(String[] args) {
        KDizelCorolla obj1 = new KDizelCorolla("hasan");

    //    System.out.println("*****");
//
    //    KDizelCorolla obj2 = new KDizelCorolla();
    //    System.out.println("****");
      //  HCorolla bf=new HCorolla("merve");
    }


}
