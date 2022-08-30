package day07_ifStatements;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ay giriniz");
        String ayIsmi= scan.next().toUpperCase();

        if (ayIsmi .equals("OCAK")|| ayIsmi.equals("SUBAT") || ayIsmi.equals("ARALIK")){
            System.out.println("girilen ay kis");
        }
        if (ayIsmi.equals("MART")|| ayIsmi.equals("NISAN") || ayIsmi.equals("MAYIS")){
            System.out.println("girilen ay ilkbahar");


    }
}
}