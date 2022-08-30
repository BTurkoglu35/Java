package practice_07;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_ArraysJava
{
    public static void main(String[] args) {

       /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       farkiniBul();




















    }

    private static void farkiniBul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz");
        int uzunluk=scan.nextInt();
        int[]arr=new int[uzunluk];
        for (int i=0;i<uzunluk;i++){
            System.out.println("arrayin"+(i+1)+". elemanini giriniz:");
            //i->oldugunda 0. eleman diyecek,biz index degil,direk eeman sorduk
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("arrayde ki en buyuk eleman ile en kucuk eleman" +
                "arasindaki fark: "+(arr[uzunluk-1]-arr[0]));


    }















     //  int[] sayilar={12,74,51,42,96,32};
     //  int min=sayilar[0];
     //  int max=sayilar[0];

     //  for (int i = 0; i < sayilar.length ; i++) {
     //      if (sayilar[i]<min){
     //          min=sayilar[i];
     //      }
     //      if (sayilar[i]>max){
     //          max=sayilar[i];
     //      }
     //  }
     //  System.out.println("min ve max deger toplami: " + (min+max));


}
