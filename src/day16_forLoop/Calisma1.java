package day16_forLoop;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {

      // //kulllanicidan isim isteyin ve ismi tersten yazdirin

      // Scanner scan=new Scanner(System.in);
      // System.out.println("bir isim giriniz");
      // String isim= scan.nextLine();
      // for (int i =isim.length()-1; i >=0 ; i--){
      //     String tersten=isim.substring(i,i+1);
      //     System.out.print(tersten);

      // }


        //kulllanicidan isim isteyin ve ismi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();

        ismiTerstenYazdirma(isim);





        }

    private static void ismiTerstenYazdirma(String isim) {
        for (int i =isim.length()-1; i >=0 ; i--) {
            String tersten=isim.substring(i,i+1);
            System.out.print(tersten);

        }














    }
}
