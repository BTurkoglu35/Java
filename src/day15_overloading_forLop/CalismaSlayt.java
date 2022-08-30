package day15_overloading_forLop;

import java.util.Scanner;

public class CalismaSlayt {
    public static void main(String[] args) {
        //  //ekrana 10 keaz java guzeldir yazdirin
        //
        //  String str="java guzeldir";
        //  for (int i=1; i<=10; i++) {
        //      System.out.println(str);}


        //  //10 ve 30 arasindaki sayilari aralarinda virgul olarak yazdirin
        //   int sayi=0;
        //  for (int i = 10; i <=30; i++) {
        //      sayi=i;
        //      System.out.print(sayi+",");

        //  }


        //100 den baslayarak 50 ye dahil kadar olan sayilari ayni satirda aralarinda virgul kullanark yazdirin

        //     int sayi=0;
        //   for (int i = 100; i>=50; i--){
        //       sayi=i;
        //       System.out.print(sayi+",");
        //   }

        //kullanicidan 100 den kucuk tamsa isteyin.1 den baslayark girilen sayiya
        //kadar 3 un ve 5 in kati olanlari yazdirin

        //      Scanner scan=new Scanner(System.in);
        //      System.out.println("lutfen yuzden kucuk bir tam sayi giriniz");
        //      int sayi=scan.nextInt();
        //       for (int i=0; i<sayi; i++) {

        //           if (i % 3 == 0 && i% 5 == 0) {

        //               System.out.println(i);
        //           }

        //       }

        //kullanicidan 100 den kucu bir tamsayi isteyin. 1 den baslayarak girilen sayiya
        // kadar 3 un kati olanalarti yazdirin


        //      Scanner scan=new Scanner(System.in);
        //    System.out.println("lutfen yuzden kucuk bir tam sayi giriniz");
        //     int sayi=scan.nextInt();
        //     if(sayi>100 || sayi<0){
        //         System.out.println( "lutfen gecerli bir sayi giriniz");
        //     } else {

        //         for (int i = 1; i <= sayi; i++) {

        //             if (i%3==0){
        //                 System.out.print(i +" ,");

        //             }
        //         }


        //     }
        //kullanicidan bir tam sayi isteyin. 1 den baslayarak girilen  sayiya
        //kadar tum sayilari yazdirin ancak;
        //-Java ucun kati ise "java"
        //-sayi 5 in kati ise "guzeldir"
        //-hem 3 un hem besin lati ise  "java guzr=eldir yazdirin"
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yuzden kucuk bir tam sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi > 100 || sayi < 0) {
            System.out.println("lutfen gecerli bir sayi giriniz");
        }
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Java");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Guzeldir");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Java Guzeldir");
            }else System.out.println(i);
        }

    }
































         }

