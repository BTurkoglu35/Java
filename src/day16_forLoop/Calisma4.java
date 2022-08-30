package day16_forLoop;

import java.util.Scanner;

public class Calisma4 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi1 ve sayi2 giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

          if (sayi1>=sayi2){
              int toplam=0;
              for (int i = sayi2; i<=sayi1; i++){

              toplam+=i;

              }
              System.out.println(toplam);
          } else if (sayi2>sayi1) {
              int toplam=0;
              for (int i = sayi1; i<=sayi2; i++) {
                  toplam+=i;

              }
              System.out.println(toplam);
          }


    }
}
