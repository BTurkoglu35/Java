package practice_05;

import java.util.Scanner;



public class Q04_ForLoop {
    public static <Tarayıcı> void main(String[] args) {
/* Mülakat Sorusu
		 Bir dizeyi tersine çevirmek için bir Java programı yazın. for döngüsü kullanın ve adında bir yöntem oluşturun
		  tersDize */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir dize griniz");
        String str=scan.nextLine();

        tersiniolustur(str);

        System.out.println(tersiniolustur(str));
        }

    private static String tersiniolustur(String str) {
      String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+= str.charAt(i);

        }






return tersStr;
    }


}

