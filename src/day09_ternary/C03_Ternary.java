package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    //kullanicidan bir sayi isteyin
    //sayi pozitif ise sayiyi yazdirin
    //sayi negatifse bir sayi daha isteyin ve ikisinin carpimini yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir  sayi girin");
        double sayi=scan.nextDouble();
         if (sayi>0.0) {
             System.out.println("sayi");
         } else {
                 System.out.println("lutfen bir  sayi daha girin");
                 double sayi2=scan.nextDouble();
             System.out.println(("sayi2*sayi"));
             }
         }
    }
// eger if else icerisinde yeni kodlar varsa ternary ile yapmamiz mummkun olmaz
