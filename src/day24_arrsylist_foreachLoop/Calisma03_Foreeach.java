package day24_arrsylist_foreachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Calisma03_Foreeach {
    public static void main(String[] args) {
    // Kullanıcıdan 2 Dize girmesini isteyin. Eğer karakter ve karakter sayıları
    // Dizeler aynıdır, ardından konsolda "Anagram" yazdırın. Aksi takdirde, "Anagram Değil" yazdırın
    // konsolda. Vakaları yoksay. Örneğin; "Mary" ve "ordu" ve "RAMY" Anagramlardır.

        Scanner scan=new Scanner(System.in);
        System.out.println("1. dizeyi girin");
        String dize1=scan.nextLine();
        System.out.println("2. dizeyi girin");
        String dize2=scan.nextLine();

       String[] a=dize1.toLowerCase().split("");
       Arrays.sort(a);
       String[] b=dize2.toLowerCase().split("");
       Arrays.sort(b);

       if(dize1.length() !=dize2.length()) {
           System.out.println("anagram degil");
       }else if(Arrays.equals(a,b)){
           System.out.println("Anagram");

        }
        System.out.println("Anagram degil");















    }
}
