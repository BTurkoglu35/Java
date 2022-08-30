package replit.ReplitConditionalSteatments;

import java.util.Scanner;

public class Soru2 {
    //iki sayıyı kıyaslayan Java kodunu yazınınz.

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1=scanner.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2=scanner.nextInt();
        
        if(sayi1==sayi2){
            System.out.println(sayi1+"=="+sayi2);
        }else if(sayi1!=sayi2&& sayi1>sayi2) {
            System.out.println(sayi1 + "!=" + sayi2 + "\n" + sayi1 + ">" + sayi2 + "\n" + sayi1 + ">=" + sayi2);
        } else if (sayi1!=sayi2&& sayi1<sayi2) {
            System.out.println(sayi1 + "!=" + sayi2 + "\n" + sayi1 + "<" + sayi2 + "\n" + sayi1 + "<=" + sayi2);

        }

    }
}
