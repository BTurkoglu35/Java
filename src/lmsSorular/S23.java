package lmsSorular;

public class S23 {
    public static void main(String[] args) {
      /*
      String dizi öğelerinde kullanılan toplam karakter sayısını bulun
Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı
       */

        String dizi[]={ "Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        int harfSayisi=0;
        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length() ; j++) {
                harfSayisi++;
            }
        }
        System.out.println(harfSayisi);












    }
}
