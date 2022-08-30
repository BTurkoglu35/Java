package practice_06;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

     //nt input=45;

     // for (int i = 0; i <=45 ; i++) {
     //     if (i%2==1){
     //         System.out.println(i+" ");
     //     }
     // }

     //while (input>0){
     //    if (input%2==1){
     //        System.out.println(input+" ");
     //    }input--;

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int count=0;
        while (sayi > 0){
            if (sayi%2==1){
                System.out.println(sayi);
                count++;
            }sayi--;
       }
        System.out.println("count= "+count);

















    }
}
