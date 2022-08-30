package day02_variables;

import java.util.Scanner;

public class Calisma6 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");
        double yarıcap=scan.nextDouble();
        System.out.println("girdiğiniz yarıçap:" +yarıcap);
        System.out.println("Dairenin çevresi:" +2*3.14*yarıcap);
        System.out.println("Dairenin alani:" +3.14*yarıcap*yarıcap);





    }
}
