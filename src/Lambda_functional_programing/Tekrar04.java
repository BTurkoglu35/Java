package Lambda_functional_programing;

import java.util.List;
import java.util.stream.IntStream;

public class Tekrar04 {
    public static void main(String[] args) {
        System.out.println(get7Den100EKadarSayilariTopla());
        System.out.println(get2Den11EKadarIntegerDeğerlerinCarpimi());
        System.out.println(faktoriyelHesapla(5));
        System.out.println(verilenIkiSayiArasindakiCiftSayilarinToplaminiBul(7,3));
        System.out.println(verilenIkiSayiArasindakiTumSayilarinRakamlariToplami(9,12));

    }
    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

    public static int get7Den100EKadarSayilariTopla() {
        int toplam= IntStream.range(1,101).sum();
        return toplam;
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int get2Den11EKadarIntegerDeğerlerinCarpimi(){
        int carpim=IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
        return carpim;
    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5

    public static int faktoriyelHesapla(int x){
        if(x>0){
        int faktoriyel= IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        return faktoriyel;
        }else System.out.println("0 dan buyuk bir deger giriniz");
        return 0;

    }
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int verilenIkiSayiArasindakiCiftSayilarinToplaminiBul(int x,int y){
        int z;
        if(x>y){
            z=x;
            x=y;
            y=z;

        }

        return IntStream.rangeClosed(x,y).filter(Utils::ciftElemanlariSec).sum();
    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int verilenIkiSayiArasindakiTumSayilarinRakamlariToplami(int x,int y){
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarinToplaminiAl).sum();





    }













}
