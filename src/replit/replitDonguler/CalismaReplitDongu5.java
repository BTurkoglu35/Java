package day16_forLoop;

public class CalismaReplitDongu5 {
    public static void main(String[] args) {
      //// 100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
      //         //OUTPUT : 100 98 96 94 92 … … … … 2 0

      // for (int i = 100; i >=0 ; i--) {
      //     if(i%2==0){
      ///         System.out.println(i);
      // Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

      // Input :1238

      // Output :Girilen Numananin Tersi: 8321

          String sayi="8324587";

        for (int i =sayi.length()-1 ; i >=0 ; i--) {
            String ters =sayi.substring(i,i+1);

            System.out.print(ters);

        }








            }

        }









