package day03_variables;

public class C02_Swap {
    public static void main(String[] args) {

        int sayi1=15,sayi2=20,bosKova;
        System.out.println("swap oncesi sayi1:"+sayi1+"sayi2:"+sayi2);
        bosKova=sayi1;
        sayi1=sayi2;
        sayi2=bosKova;
        System.out.println("swap sonrasi sayi1:"+sayi1+"sayi2:"+sayi2);


    }
}
