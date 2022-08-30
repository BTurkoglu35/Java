package replit.ReplitConditionalSteatments;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Girilen sayının pozitif, negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz ");
        int sayi = scan.nextInt();

        if (sayi==0){
            System.out.println("sayi 0'dir");

        }else if (sayi>0){
            System.out.println("sayi pozitif");
        } else if (sayi<0) {
            System.out.println("sayi negatif");
        }


    }
}
