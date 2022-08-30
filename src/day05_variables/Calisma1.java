package day05_variables;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {

        //1
        int sayi1=14;

        int sayi2=++sayi1;
        System.out.println(sayi2);

        int sayi3=sayi1++;
        System.out.println(sayi3);
        System.out.println(sayi1);


        //2
        //Kullannicidan 4 basamkli bir pozitif tam sayi isteyin. Rakamlari toplamini heapla.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 bamakli bir sayi giriiz");
        int sayi= scan.nextInt();

        int rakamlarTop=0;
        int birlerBas=0;

        birlerBas=sayi%10;
        rakamlarTop+=birlerBas;


        //3
        byte num1=Byte.MAX_VALUE;
        System.out.println(num1);

        String str="java ile hayat guzeldir";
        System.out.println(str.concat("kmskdkn"));

        Boolean buGuzelmi=true;

        System.out.println(buGuzelmi);


        int say1=4;
        int say2=9;
        String ism="fasd";
        System.out.println(say1+(say2+"  " +ism));

        String fd="java";
        String fs="guzel";
        System.out.println(fd          +fs);


    }
}
