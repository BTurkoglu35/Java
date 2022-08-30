package Practice_03;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false döndürme yapan yönteminiz
         *
         * giriş çıkış
         * aksizm == doğru
         * xyz == doğru
         * x.yz == yanlış
         * xyaz == yanlış
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine().toLowerCase();

        System.out.println(xyzVarMi(str));


    }

    public static boolean xyzVarMi(String str) {
     if(str.contains("xyz")) {
         return true;
     }else return false;


    }


}