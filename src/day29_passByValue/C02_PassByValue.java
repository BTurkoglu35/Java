package day29_passByValue;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element iceren array ve arraylist gibi yapillarda  da
        passByValue gecerlidir

        eger methodda Array veya listin kendisi degistirilirse passByValue
        ozelligi sebebi ile java degisen degeri degil array veya listin
        orjinal degerini alir
        ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
        java obje degismedigi icin (referans ayni) ayni array veya list'i bize dondurur
        Ancak icindeki elemntler degismis olacaktir
         */
        /*
        verlen dort elemnli bir array'i methoda gonderelim
        methodda yeni uc elemanli bir array atayip bu yeni arraya
        rastgele 100 den kucuk uc sayi atayalim
        ethodda arrayi yazdiralim

        main methodda da method call dan sinra yeniden methodu yazdiralim
         */

        int[] arr= {3,5,8,10};
        arrayDegistir(arr);
        System.out.println("method call'dan sonra main methodda array "+Arrays.toString(arr));
    }

    public static void arrayDegistir(int[] arr) {
        arr=new int[3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        System.out.println(" method da"+ Arrays.toString(arr));
    }
}
