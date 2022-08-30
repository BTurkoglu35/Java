package day02_variables;

import java.util.Scanner;

public class Calisma4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("karenin bir kenar uzunluğunu giriniz");
        int kenarUzunluğu= scan.nextInt();
        System.out.println("girdiğiniz kenar uzunluğu:"+ kenarUzunluğu);
        System.out.println("karenin çevresi="+kenarUzunluğu*4);
        System.out.println("karenin alanı="+kenarUzunluğu*kenarUzunluğu);


    }
}
