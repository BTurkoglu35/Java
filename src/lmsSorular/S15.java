package lmsSorular;

public class S15 {
    public static void main(String[] args) {
        /*
           Verilen bir diziden, toplamı verilen bir sayı olan tüm çiftleri bulun.
                Eğer dizi {4, 6, 5, -10, 8, 5, 20} ise ve sayı 10 ise çıktı şu şekilde olacaktır
        4+6=10, 5+5=10, -10+20=10

         */

        int arr[]={4, 6, 5, -10, 8, 5, 20};
        int top=10;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int toplam=arr[i]+arr[j];
                if(toplam==top) {
                    System.out.println(arr[i]+"+"+arr[j]+"="+top);
                }

            }

        }









    }
}
