package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str= "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel şaka şaka
        // replaceAll() all'un amaci ayni ozellikteki tüm kapsamını kapsamasıdır
        // butun sayıları sil
        // butun ozel sil

        // tum ozel silelim dedigimiz space'ler de siliniyor
        // space'leri korumak için en basta onlarin yerine cumledemeyecekler
        // bir string koyalim
        // "qazwsx"
        str=str.replace(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str); // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");

        // ozel karakter ve sayilerden kurtulduk
        // simdi space'leri geri getirelim

        str=str.replace("qazwsx"," ");

        System.out.println(str);

    }
}
