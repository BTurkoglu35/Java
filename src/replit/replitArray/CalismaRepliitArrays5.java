package day22_multiDimensionalArray;

public class CalismaRepliitArrays5 {
    public static void main(String[] args) {

        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.
        Array: [1551,1223,1443,1267,1789,1023,2020]
        Aranan Değer:2020
        Beklenen Çıktı:**True**
        Aranan Değer:2010
        Beklenen Çıktı :**False**
         */

        int[] arr={1551,1223,1443,2020,1267,1789,1023};
        int aranan=1223;
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

           if (aranan==arr[i] ){
               sayac++;
           }
        }
         if(sayac==1){
             System.out.println("**true**");
         }else System.out.println("**false**");











    }
}
