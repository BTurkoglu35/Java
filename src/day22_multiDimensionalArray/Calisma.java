package day22_multiDimensionalArray;

import java.util.Arrays;

public class Calisma {
    public static void main(String[] args) {

    //1
        // Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.


       int[] arr={1,5,7,14,9,10};

      int enBuyuk=0;
      Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);



   //2
       //Verilen bir array’e yeni bir element ekleyen method olusturun

       String[] str={"Musa","Ali","Fatma"};
       String eklenecekIsim="Nevin";

       elemanekleme(str,eklenecekIsim);











    }

    public static void elemanekleme(String[] str, String eklenecekIsim) {
        String[] yeniStr = new String[str.length+1];
        for (int i = 0; i <str.length ; i++) {
            yeniStr[i]=str[i];

        }yeniStr[yeniStr.length-1]=eklenecekIsim;
        System.out.println(Arrays.toString(yeniStr));

    }
}
