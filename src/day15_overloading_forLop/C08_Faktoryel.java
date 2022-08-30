package day15_overloading_forLop;

public class C08_Faktoryel {

    public static void main(String[] args) {

        //input olarak verilen bir tam sayi icin faktoryel hesaplayip yazdiran
        //bir method olusturun

        //verlen sayi ,negatif veya 20 den fazla olursa "girilen sayinin faktoriyeli
        //hesaplanamaz "yazdirin

        int input=6;
        faktoryelHesapla(input);




    }

    public static void faktoryelHesapla(int input) {
        int faktoriyel=1;
        if (input<0||input>20){
            System.out.println("verilen sayi icin faktoryel Hesaplanamaz");
        } else if (input==0) {
            System.out.println("0!=1 dir");

        } else {
            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;

            } System.out.println("faktoriyel = " + faktoriyel);


        }
    }


}
