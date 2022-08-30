package day07_ifStatements;

import java.util.Scanner;

public class CalismaOdev3 {
    public static void main(String[] args) {

        //soru1
        //kulllanicidan  gun ismi yazmasini isteyin.Girilen isim gecerli bir gun ise
        //1.2.3. harfleriini ilk harf buyuk diger ikisi kucuk olacak sekilde yazdirin;
        //gun ismi gecerli degilse "gecerli gun ismi giriniz" yazdirin
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazartesi")) {
        System.out.println("Pzt");
        }
        else if (gunIsmi.equals("sali")|| gunIsmi.equals("carsamba")|| gunIsmi.equals("persembe")
        || gunIsmi.equals("cuma")|| gunIsmi.equals("cumartesi")|| gunIsmi.equals("pazar"))
            System.out.println("gecerli gun ismi giriniz)");  */

        //soru2
        /* kullanicidaniki sayi isteyin. ikiside pozotif ise sayilarin toplamini yazdirin
        sayilarin ikiside negatif ise sayilarin carpimini yazdirin, sayilarin ikiside
        farkli isaretlere sahip ise "farkli isaretlerde sayilarla islem yapamazsiniz yazdirin
        sayilardan sifira esit olan varsa " sifir carpmaya gore yutan elemandir " yazdirin
         */
       /* Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        if (sayi1>0 && sayi2>0) {
            System.out.println("sayilarin toplami   :" + (sayi1+sayi2));
        }
        else if (sayi1<0 && sayi2<0) {
            System.out.println("sayilarin carpimi :" + (sayi1*sayi2));
        } else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)){
            System.out.println("farkli isaretli sayilarda islem yapamazsiniz ");
        }
        else if ((sayi1==0 && sayi2>0) || (sayi1>0 && sayi2==0)){
            System.out.println("sifir carpmaya gore yutan elemandir" );
        }*/

        //soru3
        //kullanicidan 100uzerinden notunu isteyiin.Notu harf sistemine cevirip  yazdirin. 50 den kucukse "d
        //50-60 arasi"C" 60-80 arasi "B" 80 uzeir "A"

       /* Scanner scan = new Scanner(System.in);
        System.out.println("llutfen notunuzu giriniz");
        int not = scan.nextInt();

        if (not < 50) {
            System.out.println("D");
        } else if (50 < not && not < 60) {
            System.out.println("C");}
        else if (not > 60 && not<80) {
            System.out.println("B");
        }

            else if (not > 80) {
                System.out.println("A");
            } */

           //soru4
        //kullanicidan maas icin bir teklif isteyin ve aasagidski degerlere gore cevap yazdirin.
        //Tejkif 80.0000 in uzeru=inde ise kabul ediyorum
        //60-80.000 arasida ise konusabiliiriz
        //60.000 altinda ise malesef kabul edemem.
         Scanner scan=new Scanner(System.in);
        System.out.println("maas teklifi giriiniz");
        int maasTek= scan.nextInt();

        if (maasTek>80000){
            System.out.println("kabul ediyorum");
        }
        else if (maasTek<80000 &&maasTek>60000){
            System.out.println("konusabiliriz");
        }
        else if (maasTek<60000) {
            System.out.println("maleseff kabul edemem");
        }










        }

    }
