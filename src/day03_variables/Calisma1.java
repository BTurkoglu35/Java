package day03_variables;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {
        //1
        int say=10;
        char harf='a';
        String str="banan";

        System.out.println(say+harf);
        System.out.println(str+harf);
        System.out.println(harf+2);
        System.out.println(""  +say+harf);

    ///  //2
    ///  int sayi1=43;
    ///  int sayi2=21;
    ///  System.out.println("swaptan once sayi1:" +sayi1 +"sayi2:" +sayi2);
    ///  int temp;
    ///  temp=sayi2;
    ///  sayi2=sayi1;
    ///  sayi1=temp;
    ///  System.out.println("swaptan sonra sayi1:" +sayi1 +"sayi2:" +sayi2);


         //3
    //   Scanner scan = new Scanner(System.in);
    //   System.out.println("llutfen isminizi giriniz");
    //   String isim=scan.nextLine();
    //   System.out.println("girdiginiz isim:" +isim);
    //   System.out.println("lutfen yasinizi giriniz");
    //   int yas=scan.nextInt();
    //   System.out.println("girdiginiz yas:" +yas);
    //   System.out.println("llutfen dogum tarihi giriniz");
    //   String dogumTarihi=scan.next();
    //   System.out.println("dogoum tarihi:" +dogumTarihi);


        //4
    ///   Scanner scan =new Scanner(System.in);
    ///   System.out.println("karenin bir kenar uzunlugunu giriniz:");
    ///   double kenaruzunlugu= scan.nextDouble();
    ///   System.out.println("karenin cevresi:"+(kenaruzunlugu*4));
    ///   System.out.println("karenin alani:"+(kenaruzunlugu*kenaruzunlugu));


        //5
    //   Scanner scan=new Scanner(System.in);
    //   System.out.println("sayi1 girin");
    //   double sayi1=scan.nextDouble();
    //   System.out.println("sayi2 giriniz");
    //   double sayi2=scan.nextDouble();
    //   System.out.println("girilen sayilarin carpimi:"+sayi1*sayi2);

        //6
    ///    Scanner scan=new Scanner(System.in);
    ///    System.out.println("ismininizi giriniz");
    ///    String isim=scan.nextLine();
    ///    System.out.println("soyisminizi giriniz");
    ///    String soyisim=scan.nextLine();
    ///    System.out.println("yainizi giriniz");
    ///    double yas=scan.nextDouble();
    ///    System.out.println("girdiginiz bilgiler:" +isim+"  " +soyisim+"  "+yas);

        //7
    //   Scanner scan=new Scanner(System.in);
    //   System.out.println("lutfen isminizi giriniz");

    //   char ilkHarf=scan.next().toUpperCase().charAt(0);
    //   System.out.println("ilk harf:"+ilkHarf);
    //   String isim= scan.nextLine();

        //8
        Scanner scan= new Scanner(System.in);
        System.out.println("sayi1 yaziniz:      "+"sayi2 yaziniz:      ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("toplamlari:"+(sayi1+sayi2));
        System.out.println("sayi1-sayi2:" +(sayi1-sayi2) + "sayi2-sayi1:" + (sayi2-sayi1));
        System.out.println("carpimlari:"+(sayi1*sayi2));











    }
}
