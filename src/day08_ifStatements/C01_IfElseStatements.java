package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        /*kullanicidan gun ismini yazmasini isteyin.girilen gun gecerli
        bir guun ise 1.2.3. harflerini yazdir.ilk harf buyk diger harfler kucuk yazilacak.
        gun ismi gecerli degilde gecerli bir gun ismi grin yazdir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("gun ismi giriniz");
        String gunIsmi=scan.nextLine().toLowerCase();

        if(gunIsmi.equals("pazartesi")){
            System.out.println("Paz");
        }else if(gunIsmi.equals("sali")){
            System.out.println("Sal");
        }else if(gunIsmi.equals("carsambar")){
            System.out.println("Car");
        }else if(gunIsmi.equals("persembe")){
            System.out.println("Per");
        }else if(gunIsmi.equals("cuma")){
            System.out.println("Cum");
        }else if(gunIsmi.equals("cumartesi")){
            System.out.println("Cum");
        }else if(gunIsmi.equals("pazar")){
            System.out.println("Paz");
        }else{
            System.out.println("gecerli bir gun ismi giriniz");
        }



    }

}
