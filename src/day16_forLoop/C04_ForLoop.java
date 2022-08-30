package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    //kullanicidan bir tam sayi isteyin. 1 den baslayarak girilen  sayiya
    //kadar tum sayilari yazdirin ancak;
    //-Sayi ucun kati ise "java"
    //-sayi 5 in kati ise "guzeldir"
    //-hem 3 un hem besin lati ise  "java guzr=eldir yazdirin"
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kutfen 100den kucuk bir pozitif tam sayi girin");
        int sayi=scan.nextInt();

        for (int i=1 ; i<=sayi ; i++) {
            if(i%3==0 && i%5==0) {
                System.out.print( "java guzeldir yazdirin  " );
            }else if(i%3==0) {
                System.out.print("java"+" ");
            }else if(i%5==0) {
                System.out.print("guzeldir" +" ");
            }else System.out.print(i+" ");
        }









    }











}
