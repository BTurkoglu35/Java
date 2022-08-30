package Practice_03;

import java.util.Scanner;

public class Q07_StringManipulation {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dort harfli bir kelime  giriniz");
        String str=scan.nextLine();
        String strTersten=str.substring(3,4)+
        str.substring(2,3)+
        str.substring(1,2)+
        str.substring(0,1);
        System.out.println(strTersten);



    }
}
