package day16_forLoop;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve Stringi tersine ceviren
        //bir method yazin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String isim=scan.nextLine();
        TersIsim(isim);

    }

    public static void TersIsim(String isim) {
        String tersIsim="";
        for (int i = isim.length()-1; i >=0 ; i--) {
            tersIsim+=isim.substring(i,i+1);


        }
        System.out.println(tersIsim);
    }
}
