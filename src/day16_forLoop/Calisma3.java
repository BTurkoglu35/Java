package day16_forLoop;

import java.util.Scanner;

public class Calisma3 {
    public static void main(String[] args) {
       // Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
      //  palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String isim=scan.nextLine();

        PalindromeMi(isim);

    }

    public static void PalindromeMi(String isim) {
      String  tersIsim="";
        for (int i = isim.length()-1; i >=0 ; i--) {
            tersIsim+=isim.substring(i,i+1);

        }
        System.out.println(tersIsim);
        if (tersIsim.equals(isim)) {
            System.out.println("Palindrome kelime");
        }else System.out.println("palindrome kelime degil");
    }
}
