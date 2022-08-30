package day18_while_doWhileLoop;

import java.util.Scanner;

public class Calisma1 {
    public static void main(String[] args) {
        //kullanicidan bir sayi alailm ve bu sayinin carpim tablosounu ekranda yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.print(sayi+"*"+i+"="+(sayi*i)+" ");
        }
        System.out.println();
        int bas=1;
        int bitis=10;
        while (bas<=bitis) {
            System.out.print(sayi+"*"+bas+"="+(sayi*bas)+" ");
            bas++;
        }
        System.out.println();

        int bass=1;
        int bitiss=10;
        do {
            System.out.print(sayi+"*"+bass+"="+(sayi*bass)+" ");
            bass++;
        }while (bass<=bitiss);









        }















    }

