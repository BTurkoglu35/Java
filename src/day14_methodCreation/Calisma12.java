package day14_methodCreation;

import java.util.Scanner;

public class Calisma12 {
    public static void main(String[] args) {
  //    . Bir dizenin geçerli bir parola olup olmadığını kontrol etmek için bir Java yöntemi yazın. Düzenleyiciye gidin
  //    Şifre kuralları:
  //    Bir şifre en az on karakterden oluşmalıdır.
  //    Bir şifre sadece harf ve rakamlardan oluşur.
  //    Bir parola en az iki basamak içermelidir.

  //  Beklenen çıktı:

  //    1. Bir parola en az sekiz karakterden oluşmalıdır.
  //    2. Bir parola yalnızca harf ve rakamlardan oluşur.
  //    3. Bir parola en az iki basamak içermelidir
  //    Bir şifre girin (Yukarıdaki Hüküm ve Koşulları kabul ediyorsunuz.): abcd1234
  //    Şifre geçerli: abcd1234
        int kontrol=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre= scan.nextLine();
        if (sifre.length()-1<=8);
        kontrol++;
        if (sifre.contains("\\W"));
        kontrol++;

        System.out.println(kontrol);




    }
}
