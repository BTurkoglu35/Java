package recap1;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
       int sayi=54785;

       int ilkIki=sayi/1000;
       int sonIki=sayi%100;

       int ilkIkiTop=(ilkIki/10)+(ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop=( sonIki/10 )+( sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("rakamlar Top = " +(ilkIkiTop+sonIkiTop));
    }
}
