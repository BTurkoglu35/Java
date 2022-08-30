package day18_while_doWhileLoop;

public class C02_whileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve bu sayinin
        //rakamllari toplamini yazdirin

        int input=5431;
         int rakamlarToplami=0;
         int birlerBasamagi=0;
         int temp =input;

       while (temp>0){
           birlerBasamagi=temp%10;
           rakamlarToplami+=birlerBasamagi;
           temp/=10;

       }
        System.out.println((input +"sayisinin rakamlarToplami "+rakamlarToplami));











    }
}
