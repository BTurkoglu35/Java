package practice_04;

import java.util.Scanner;

public class Hazirlik1 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol edin.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol edin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir seyler yaziniz");
        String str=scan.nextLine();
        if (str.contains(" ")){
            System.out.println("bosluk iceriyor");}
        if (str.isEmpty()){
            System.out.println("str Stringinin ici bos");}







    }
}
