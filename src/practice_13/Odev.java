package practice_13;

import java.util.Scanner;

public class Odev {
     /*
  Crteate a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
  Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
  polindrome :tersten okunuşu da aynı olan ifadeierdir.
  ornek : Ey edip Adanada pide ye,  Traş niçin şart             // StringBUILDER
   */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("biri string giriniz");
        String str=scanner.nextLine();

        StringBuilder builderStr = new StringBuilder();
        builderStr.append(str);
        String tersStr = builderStr.reverse().toString();
        if (str.equals(tersStr)){
            System.out.println("palindrome string");
        }else System.out.println("palindrome string degil");

    }











}
