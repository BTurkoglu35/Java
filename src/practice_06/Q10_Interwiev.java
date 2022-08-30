package practice_06;

import java.util.Scanner;

public class Q10_Interwiev {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir string giriniz:");
        String input=scan.nextLine();
        System.out.println("lutfenbir sayi giriniz:");
        int sayi=scan.nextInt();

        ilksonHarf(input,sayi);
        System.out.println(ilksonHarf(input,sayi));


    }

    private static String ilksonHarf(String input, int sayi ) {
        String s=input.substring(0,1)+input.substring(input.length()-1);
        String sonuc="";

        for (int i = 1; i <=sayi ; i++) {
            sonuc=sonuc+s;

        }


        return sonuc;
    }
}
