package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();
        // toLowerCase girilen yaziyi standart bicime sokar.

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi"))
        {
            System.out.println("girilen gun haftasonu");

        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||gunIsmi.equals("carsamba")
                || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){


            System.out.println("girilen gun haftaici");
        }


    }
    }