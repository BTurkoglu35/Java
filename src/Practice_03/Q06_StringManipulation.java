package Practice_03;

import java.util.Scanner;

public class Q06_StringManipulation {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol edin.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol edin.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int bosluk = str.indexOf(' ');

        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");

        } else {
            System.out.println("bosluk vardir");

        }


    }


}
