package day18_while_doWhileLoop;

import java.util.Scanner;

public class Calisma4 {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve bu sayinin rakamlar toplamini bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int rakamlarTop=0;
        int birlerBas=0;


        while (sayi>0){
            birlerBas=sayi%10;
            rakamlarTop+=birlerBas;
            sayi/=10;





        }
        System.out.println(rakamlarTop);








    }
}
