package lmsSorular;

import java.util.Arrays;

public class S20 {
    public static void main(String[] args) {
        /*
        Bir tamsayı dizisindeki en küçük pozitif elemanı ve en büyük negatif elemanı bulun
      Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
         */

        int arr[]={12,10,-4,6,-16};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int enBuyukNegatif=arr[0];
        int enKucukPozitif = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0&& arr[i]>enBuyukNegatif){
             enBuyukNegatif=arr[i];
            }else if(arr[i]>0&&arr[i]<enKucukPozitif){
                enKucukPozitif=arr[i];

            }
        }
        System.out.println("encucukPozitif = " + enKucukPozitif);
        System.out.println("enBuyukNegatif = " + enBuyukNegatif);






    }





        }
