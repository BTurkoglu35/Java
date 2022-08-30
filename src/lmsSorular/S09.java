package lmsSorular;

public class S09 {
    public static void main(String[] args) {
        /*

Bir tamsayıdaki rakamların toplamını bulmak için kod yazın
  */
        int sayi=451;
        int basamak=0;
        int rakamlarinTop=0;
        while (sayi>0) {
            basamak=sayi%10;
            rakamlarinTop+=basamak;
            sayi/=10;
        }
        System.out.println(rakamlarinTop);









    }
}
