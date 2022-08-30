package day04_vaiables;

public class C03_AutoWidening {
    public static void main(String[] args) {

       /* char harf='b';
        char harf2=harf;*/

        byte sayi1=23;
        short sayi2= 55;
        int sayi3= sayi1+sayi2;//   88

        double sayi4= sayi1*sayi2;//  1265.0

        sayi4=sayi2/sayi1;//2.391... yerine sonuc 2 yazar
        // cunku once
        // sagdan baslanir yani once i;lem
        // sonucu int oldugu icin
        // deger int olarak hesaplanir double kutusuna atar

        System.out.println(sayi4);
        sayi4=(double) sayi2/sayi1;
        //sonucun tam cikmasi icin parantez icinde
        // sayilardan birine
        // double atanir
        System.out.println(sayi4);


    }
}
