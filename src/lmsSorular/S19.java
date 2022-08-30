package lmsSorular;

public class S19 {
    public static void main(String[] args) {
        /*
        Bir tamsayı dizisinde ortadaki elemanı bulma
Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı=8
 (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı=(8+12)/2 = 10
         */

        int arr[]={4,7,5,4};
        int ort=(arr.length-1)/2;
        if(arr.length%2==0){

            System.out.println((arr[ort]+arr[ort+1])/2);
        }else System.out.println(arr[ort]);







    }
}
