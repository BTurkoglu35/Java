package day21_arrays;

public class Calisma5 {
    public static void main(String[] args) {
     //  String dizi öğelerinde kullanılan toplam karakter sayısını bulun
     //  Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

      String[] dizi={"Kemal","Jonathan", "Mark", "Angie", "Veli" };
      int karakter=0;
        for (int i = 0; i <dizi.length; i++) {
             karakter+=dizi[i].length();




        }
        System.out.println("karakter = " + karakter);









    }
}
