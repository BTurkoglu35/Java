package day22_multiDimensionalArray;

public class CalismaReplitArrays9 {
    public static void main(String[] args) {
        /*
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        Array: [1,2,3,4,5,6,7,8,9]
        Beklenen Çıktı:
        Tek Sayilar: 5
         Cift Sayilar: 4
         */

        int[] arr={1,2,3,4,5,6,7,8,9};
        int sayacTek=0;
        int sayacCift=0;

        for (int i = 0; i <arr.length; i++)  {
            if(arr[i]%2==0){
                sayacCift++;
            }else sayacTek++;

        }
        System.out.println("Cift sayilar :" + sayacCift);
        System.out.println("Tek sayilar : " + sayacTek);










    }
}
