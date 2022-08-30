package Practıce_01;

import java.util.Scanner;

public class Q10_IfSteatment {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("y veya n giriniz");
        char deger=scan.next().toUpperCase().charAt(0);

        if(deger=='Y'){
            System.out.println("YES");
        }else if (deger=='N'  ){
            System.out.println("NO");
        }else {
            System.out.println("yanlis giris yaptiniz. sadece y/n ikilisinden birini giriniz");
        }
    }
}
