package practice_06;

import java.util.Scanner;

public class Q01_whileLoop {
    public static void main(String[] args) {

    // // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    // int input=452;

    // int bitis=0;
    // int birlerBas=0;
    // int rakamlarTop=0;

    // while (input>0){
    //     birlerBas=input%10;
    //     rakamlarTop+=birlerBas;
    //     input/=10;

    // }
    // System.out.println(rakamlarTop);


     // ders cozumu
        Scanner scan=new Scanner(System.in);

        int sayi=scan.nextInt();
        basamakToplami(sayi);
        System.out.println(basamakToplami(sayi));
        }

    private static int basamakToplami(int sayi) {
    int toplam=0;

        while (sayi!=0){
        toplam+=sayi%10;
        sayi/=10;
    }

    return  toplam;
    }


}
