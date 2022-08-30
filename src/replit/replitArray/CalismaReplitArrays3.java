package day22_multiDimensionalArray;

public class CalismaReplitArrays3 {
    public static void main(String[] args) {
       /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
                Array = [20, 30, 25, 35, -16, 60, -100 ]
                Beklenen Çıktı:
                Array Sayılarının ortalaması: 7.0*/

        int[] array={20, 30, 25, 35, -16, 60, -100};
        double ortalama=0;
        int toplam=0;
        int sayac=0;

        for (int i = 0; i <array.length; i++)  {
             toplam+=array[i];
            sayac++;
        }ortalama=toplam/sayac;
        System.out.println(ortalama);










    }
}
