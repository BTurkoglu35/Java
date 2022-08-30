package Practice_03;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
       Scanner scan = new Scanner(System.in);
       System.out.println(" Cumle olusturmak icin 1. kelimeyi giriniz");
       String kelime1= scan.nextLine();
       System.out.println("Cumle olusturmak icin 2. kelimeyi giriniz");
       String kelime2= scan.nextLine();
       System.out.println("Cumle olusturmak icin 3. kelimeyi giriniz");
       String kelime3= scan.nextLine();
       System.out.println("Cumle olusturmak icin 4. kelimeyi giriniz");
       String kelime4= scan.nextLine();
       System.out.println(kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)
       +" "+kelime2+ " "+kelime3+" "+kelime4+".");


    }
}
