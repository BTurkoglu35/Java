package day03_variables;

public class C03_swap2 {

    // bir onceki swap sorusunu bos kova kullanmadan yapin
    public static void main(String[] args) {
        int sayi1=10 , sayi2=20;
        System.out.println("Swap oncesi:" +sayi1 +"   "  +sayi2);
        sayi1= sayi2+sayi1;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("swap sonrasi:" +sayi1 +"  " +sayi2);
    }





}
