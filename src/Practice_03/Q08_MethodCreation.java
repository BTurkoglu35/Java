package Practice_03;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayaliniz.
      Kullanicidan iki sayi isteyinni isteyiniz.
      Girilen iki sayi ve secilen gore dogrusu oldugu gibi yazdiriniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yapmak istediginiz islemin sembolunu giriniz");
        char sembol = scan.next().charAt(0);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        hesapMakinesi(sembol, sayi1, sayi2);


    }

    public static void hesapMakinesi(char sembol, double sayi1, double sayi2) {
        if (sembol == '+') {
            System.out.println("girilen sayilarin toplami=  "+ (sayi1 + sayi2));
        }else if (sembol == '-'){
            System.out.println("girilen sayilarin farki= " + (sayi1 - sayi2));
        } else if (sembol == '*') {
            System.out.println("girilen sayilarin carpimi= "+ (sayi1 * sayi2));
        } else if (sembol == '/') {
            System.out.println("girilen sayilarin bolumu= "+ (sayi1 / sayi2));

        }


    }
}