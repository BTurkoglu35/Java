package day16_forLoop;

public class Calsima9 {
    public static void main(String[] args) {
      //    Java'da bir sayı ile dik açılı üçgen gibi örüntüyü gösteren bir program yazın. editöre git
      //    Test Verisi
      //    Girilen satır sayısı : 10
      //    Beklenen Çıktı :
      //    1
      //    12
      //    123
      //    1234
      //    12345
      //    123456
      //    1234567
      //    12345678
      //    123456789
      //    12345678910

         for (int i = 1; i <=10 ; i++) {
             for (int j =1 ; j <=i ; j++) {
                 System.out.print(j);

             }
             System.out.println();

         }
    }
}
