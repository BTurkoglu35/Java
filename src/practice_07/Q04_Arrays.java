package practice_07;

public class Q04_Arrays {
    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String str="java'ya iyi calis!!!";
        str=str.replaceAll(" ","");
        String[] arrayStr = str.split("");
        int sayac=0;

        for (int i=0; i<arrayStr.length; i++)  {
            sayac++;

        }
        System.out.println("karakter sayisi "+sayac);






    }
}
