package day07_ifStatements;

import java.util.Scanner;

public class CalismaOdev2 {
    public static void main(String[] args) {
        //*soru1
        // kulllanicidan dildortgeninin kenar uzunluklaaarini
        //isteyin ve dikdortgenin kare olup olmdagini yazdirin


    //    Scanner scan = new Scanner(System.in);
    //    System.out.println("lutfen kenar uzunluklarini giriniz");
    //    int kenar1 = scan.nextInt();
    //    int kenar2 = scan.nextInt();
//
    //    if (kenar1 == kenar2) {
    //        System.out.println("dikdortgen karedir");
//
    //    } else {
    //        System.out.println("dikdortgen kare degildir");
    //    }


       // soru2
       //kullanicidan bir karakter girmesini isteyin ve girilen
       //karkterin harf olup olmadigini yazddirin

    //  Scanner scan = new Scanner(System.in);
    //   System.out.println("lutfen bir karakter giriniz");
    //   char karakter=scan.next().charAt(0);

    //   if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z'))
    //   {
    //       System.out.println("girilen karakter harf");

    //   } else {
    //   System.out.println("girilen karakter harf degil");

    //   }

        //soru3
        //kullaniciya yasini sorun yasi 65 den kucukse emekli ollamazsin
        // buykse emekli olabilsin yazdir

   //   Scanner scan=new Scanner(System.in);
   //   System.out.println("Lutfen yasinizi girniz");
   //   int yas=scan.nextInt();

   //   if(yas<65){
   //       System.out.println("emekli olamazsin"+(65-yas) +"yil daha calis");

   //   }else {
   //       System.out.println("emekli olabilrsin" );;
   //   }

        //soru4
        //Kullnicidan bir ucgenin uc kenar uzunlugunu alin birbirine esit ise
        //ekrana "eskenar ucgen" degilse "eskenar degil" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar3==kenar1 && kenar3==kenar2) {
            System.out.println("eskenar ucgen");
        } else {
            System.out.println("eskenar ucgen degil");
        }



}
}