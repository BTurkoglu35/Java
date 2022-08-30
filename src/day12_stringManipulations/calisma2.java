package day12_stringManipulations;

import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) {
    //   String str=" Java ogrenmek123 Cok guzel@ ";
    //   String str1=str.trim();
    //   String str2=str1.replaceAll("\\d","");
    //   String str3=str2.replace("C","c");
    //   String str4=str3.replace("@","");
    //   System.out.println("str4 = " + str4+".");

     // String str1="$13.99";
     // String str2="$10.55";
     // String str3=str1.replace("$","");
     // String str4=str2.replace("$","");
     // double say1=Double.parseDouble(str3);
     // double say2=Double.parseDouble(str4);
     // double say3=say1+say2;


     // System.out.println("say3 = " + "$"+say3);


    //    Scanner scan=new Scanner(System.in);
    //    System.out.println("isim giriniz:");
    //    String isim=scan.nextLine();
    //    if (isim.contains("a")&&isim.contains("Z")) {
    //        System.out.println("a ve Z harfi iceriyor");
    //    }else if (isim.contains("Z")){
    //            System.out.println("isim Z harfi iceriyor");
    //    }else if (isim.contains("a")){
    //        System.out.println("isim a harfi iceriyor");
    //    } else System.out.println("isim a harfi veya Z harfi icermiyor");
//
      //  Scanner scan=new Scanner(System.in);
      //  System.out.println("isminizi giriniz");
      //  String isim=scan.nextLine();
      //  System.out.println("soyadinizi giriniz");
      //  String soyad=scan.nextLine();
      //  int uzunlukIsim=isim.length();
      //  int uzunlukSoyIsim=soyad.length();
      //  if (uzunlukIsim>uzunlukSoyIsim){
      //      System.out.println(isim);}
      //  else if (uzunlukSoyIsim>uzunlukIsim) {
      //      System.out.println(uzunlukSoyIsim);}
      //  else {System.out.println("esittir");
      //  }
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sifre giriniz");
        String sifre =scan.nextLine();
        int kontrol=0;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else System.out.println("ilk harf buyuk olmali");
        if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else System.out.println("son harf kucuk olmali");

        if(sifre.contains(" ")){
            System.out.println( "sifre bosluk icermemeli");
        }else kontrol++;

        if(sifre.length()>=8){
            kontrol++;

        }else System.out.println ("sifre uzunlugu en az 8 karakter olmali");

        if (kontrol==4){
            System.out.println("sifreniz basari ile kaydeilmistir");
        }else System.out.println("islem basarisiz tekrar deneyin");








        }


    }

