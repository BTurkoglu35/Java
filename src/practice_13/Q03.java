package practice_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
   /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
   public static void main(String[] args) {
       List<Integer> fibonacci = new ArrayList<Integer>();
       Scanner scan=new Scanner(System.in);
       System.out.println("bir sayi giriniz");
       int sayi=scan.nextInt();
       fibonacci.add(0);
       fibonacci.add(1);

       int i=1;
       if (sayi<=1) {
           System.out.println("daha buyuk sayi giriniz");
       }else{
           while (fibonacci.get(i)<sayi) {//fibonacci elemanlari sayidan kucuk oldugu surece

               fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));
               i+=1;
           }
           System.out.println(fibonacci);
       }
       int sonIndextekiEleman=fibonacci.size()-1;
       if (fibonacci.get(sonIndextekiEleman)>sayi){
           fibonacci.remove(sonIndextekiEleman);
           System.out.println(fibonacci);
       }else System.out.println("senin girdigin sayi fibonacci listinde var = "+fibonacci);













   }

}
