package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        //kullanicidan 100uzerinden notunu isteyiin.Notu harf sistemine cevirip  yazdirin. 50 den kucukse "d
        //50-60 arasi"C" 60-80 arasi "B" 80 uzeir "A"

        Scanner scan= new Scanner(System.in);

        System.out.println("llutfen notunuzu giriniz");
        int not = scan.nextInt();
        if (not<0 || not>100){
            System.out.println("llutfen gecerli bir not giriniz");
        } else  if (not < 50) {
            System.out.println("D");
        } else if (50 <= not && not <= 60) {
            System.out.println("C");}
        else if (not > 60 && not<80) {
            System.out.println("B");
        } else   {
                System.out.println("A");
            }
    }
}
