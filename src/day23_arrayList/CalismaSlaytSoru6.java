package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalismaSlaytSoru6 {
    public static void main(String[] args) {

         /*
        1'den baslayarak istenen kadar Fibonacci sayisini liste olarak olusturup yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println(" fibonacci sayisi adedi giriniz");
        int sayi=scan.nextInt();
        List<Integer> fibanocci=new ArrayList<Integer>();
        int a=0;
        int b=1;
        int c=0;



        for (int i = 0; i <sayi ; i++) {
            for (int j =i; j <i+1 ; j++) {

                a=b;
                b=c;
                c=a+b;

             fibanocci.add(j,c);

            }
            System.out.println(fibanocci);

        }









    }
}
