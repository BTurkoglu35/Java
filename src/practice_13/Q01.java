package practice_13;

import java.util.Scanner;

public class Q01{
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */
//recursive = method icinden method cgirma
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
        armstrongMu(sayi);
        girilenSayiyaKadarArmstrongSayilar(sayi);




    }

    private static void girilenSayiyaKadarArmstrongSayilar(int sayi) {
        for (int i = 0; i <=sayi ; i++) {
            armstrongMu(i);

        }
    }

    private static void armstrongMu(int sayi) {
        int sayininKuplerininToplami=0;
        int basamaktakiSayisi=0;
        int girilenSayi=sayi;

        while (sayi>0) {
            basamaktakiSayisi=sayi%10;
            sayininKuplerininToplami+=Math.pow(basamaktakiSayisi,3);
                   // (basamaktakiSayisi*basamaktakiSayisi*basamaktakiSayisi);
            sayi/=10;
        }
        if (sayininKuplerininToplami==girilenSayi){
            System.out.println("armstrong sayidir "+girilenSayi);
        }else System.out.println("armstrong sayi degil "+girilenSayi);


    }
}
