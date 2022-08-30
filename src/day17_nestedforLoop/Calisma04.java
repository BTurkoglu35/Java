package day17_nestedforLoop;

import java.util.Base64;
import java.util.Scanner;

public class Calisma04 {
    public static void main(String[] args) {
        //kullaniicidan baslangic ve bitis dgerleri alin
        //while loop ile baslangi ve bitis dgerleri araasindaki cift sayilari yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen baslangic degerini giriniz");
        int baslangic=scan.nextInt();
        System.out.println("lutfen bitis degerini giriniz");
        int bitis=scan.nextInt();

        while (baslangic<=bitis) {
            if (baslangic%2==0){
                System.out.print(baslangic+ " ");
            }baslangic++;
        }





    }
}
