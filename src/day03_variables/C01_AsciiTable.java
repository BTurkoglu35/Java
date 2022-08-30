package day03_variables;

public class C01_AsciiTable {
    public static void main(String[] args) {
        //bir tam sayi ve bir char degiskeni belirleyip topllayalim.


        int sayi1=10;
        char letter='a';
        String str="banana";

        System.out.println(sayi1+letter);
        System.out.println(str+letter);
        //char yeniharf=harf+2   java once sagdaki islemi yapar,sagdaint+char
        //char data turu isleme girdigi sirada kullanildigi diger
        // data turlerine gore degisiklik gosterir.
        //char yeniHarf=harf+2     jaava once sagdaki islemi yapar,sagda int+char
        //gorunce asccii degerini sonra atama islemi yapmaya calisir. char yeniHarf=99;
        //buatama java acisindan kabul edikebilir degildir.
        //str+harf=banana     string data turu cok kuvvetlidir. hangi data turuyle
        //isleme girersegirsiiin kendine benzetir.

        //konsolda 10a gormek icin stringi bir sekilde devreye sokmak gerekir.
        System.out.println(""+sayi1+letter);
    }
}
