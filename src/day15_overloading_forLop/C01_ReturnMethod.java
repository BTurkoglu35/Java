package day15_overloading_forLop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayiyi carpip
        //sonucu bize donduren method olusturun

        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(sonuc);


    }



    public static int carpGetir(int sayi1, int sayi2) {

        return sayi2*sayi1;

    }


}
