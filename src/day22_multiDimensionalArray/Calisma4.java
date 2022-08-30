package day22_multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Calisma4 {
    public static void main(String[] args) {
        /*
         Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
       birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
       yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
       Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */
          int[][] arr={ {1,2,3}, {4,5}, {6,7} };
          int[] yeniArr=new int[arr.length];
          int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++)  {
                toplam+=arr[i][j];

            }yeniArr[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(yeniArr));


     /*
     Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

      */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        String[] arrCumle=cumle.split(" ");
        int kelimeSayisi=0;

        for (int i=0; i<arrCumle.length; i++) {

            kelimeSayisi++;

        }
        System.out.println("kelimeSayisi = " + kelimeSayisi);




















    }
}
