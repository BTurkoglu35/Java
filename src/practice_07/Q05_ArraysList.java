package practice_07;

import java.util.*;

public class Q05_ArraysList {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim."trim" ile
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        List<String> databaseIsimler = new ArrayList<>();

        databaseIsimler.add("enes");
        databaseIsimler.add("ismail");
        databaseIsimler.add("abdulbaki");
        databaseIsimler.add("emre");
        databaseIsimler.add("melisa");
        databaseIsimler.add("oguz");
        System.out.println(databaseIsimler);

        Scanner scanner = new Scanner(System.in);
        System.out.println("kullanmak istedginiz ismi giriniz");
        String isim = scanner.nextLine().trim();

        boolean isimVarMi = databaseIsimler.contains("isim");

        if (isimVarMi) {
            System.out.println("bu kullanici adi zaten alinmis");
        } else System.out.println("bu kullanici adini kullanbilirsiniz");
             int randomSayi = new Random().nextInt(100);
            isim = isim + "" + randomSayi;
            System.out.println("yeni kullanici adini kullanbilirsiniz : " + isim);
            databaseIsimler.add("isim");
            System.out.println(databaseIsimler);






















    }
}
