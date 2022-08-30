package lmsSorular;

import java.util.Arrays;

public class S22 {
    public static void main(String[] args) {
        /*
        String 'n' veya 'k' ile bitiyorsa, bir String dizisindeki elemanların baş harflerini alır
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM'dir
         */

        String arr[]={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith("n")||arr[i].endsWith("k")){
                System.out.print(arr[i].charAt(0));
            }
        }







    }
}
