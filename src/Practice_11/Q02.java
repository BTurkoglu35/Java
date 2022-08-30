package Practice_11;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan
         *  alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scanner.nextLine();
        System.out.println("tekrar sayisini giriniz");
        int tekrar=scanner.nextInt();
        String tekrarHArf=yazdir(str,tekrar);




    }

    private static String yazdir(String str, int tekrar) {
        String tekrarHArf="";
        for (int i = 0; i <tekrar ; i++) {
            System.out.print(str.substring(0,1)+str.substring(str.length()-1));

        }





      return tekrarHArf;
    }
}
