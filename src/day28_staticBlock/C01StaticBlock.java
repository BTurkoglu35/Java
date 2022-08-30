package day28_staticBlock;

public class C01StaticBlock {

    static  int sayi;
    static {
        /*
        static blok class uyelerinin tamamindan once calisir
        (main metoddan bile once)
        static blok class olusturuldugunda calisir
        genelliklede classla ilgili on ayarlamalar
        veye static veriablelere deger atamak icin kullanilir
        static blocklarin class icerisindee nerede oldugu onemli degildir.
        once static bloklar calisir

        birden fazla static blok varsa yukaidan asagiya dogru calisir
         */
        System.out.println("static blok calisti");
        sayi=10;
    }
    public static void main(String[] args) {
        System.out.println("main metod calisti");
        System.out.println(sayi);
    }
     static {
         System.out.println("mein metod altindaki static block calisti");
     }

}
