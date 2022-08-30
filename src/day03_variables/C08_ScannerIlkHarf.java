package day03_variables;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        // kullanicidan ismini alip, ilk harfini buyuk harf olarak yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        /*
          Java Scanner class'inda nextChar() method'u yoktur
          bunun yerine String olarak ilk kelimeyi alip
          onun da ilk harfini alabiliriz
         */
       char besinciHarf=scan.next().toUpperCase().charAt(4);
        System.out.println("besinci harf:"+besinciHarf);
        String isim=scan.nextLine();

    }

    }

