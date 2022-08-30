package recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        //kullanicidan isim ve soyisim girmesini isteyin, sonrasinda konsola
       // ismini buyuk harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz");
        String firstName=scan.nextLine(),
                lastName=scan.nextLine();//multiple declaration

        String fullName=firstName.concat("  "+lastName).toUpperCase();
        System.out.println(fullName);


    }
}
