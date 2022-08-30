package Lambda_functional_programing;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {


        System.out.println(get7Den100EToplam());
        System.out.println("get7Den100EToplam2 ikinci yol " + get7Den100EToplam2());
        System.out.println("get2Den11eKadarCArpim "+get2Den11eKadarCArpim());
        System.out.println("faktoriyel hesapla "+faktoriyelHesaplama(0));
        System.out.println(verilenIkiSayiarasindakiCiftSayilarinToplami(6,9));
        System.out.println(" verilenIkiSayiArasindakiTumSayilarinRakamlariToplami "+verilenIkiSayiArasindakiTumSayilarinRakamlariToplami(23,32));

    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

     //1.yol
    public  static  int get7Den100EToplam() {
      return   IntStream.range(7,101).reduce(Math::addExact).getAsInt();
    }
    //2.yol
    public  static  int get7Den100EToplam2() {
        return   IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int get2Den11eKadarCArpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static int faktoriyelHesaplama(int x){
        if (x > 0) {
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0 dan buyuk deger giriniz");
        return 0;
    }

    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    public static int verilenIkiSayiarasindakiCiftSayilarinToplami(int x,int y) {
        int z =0;
        if (x > y) {
            z=x;
            x=y;
            y=z;
        }
        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemanlariSec).sum();

    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public  static int verilenIkiSayiArasindakiTumSayilarinRakamlariToplami(int x,int y){
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarinToplaminiAl).sum();
    }









}
