package day10_strıngManıpulatıon;

public class C05_length {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";
        System.out.println(str.length());//str in karakter sayisini dondurun19
        System.out.println(str.charAt(str.length()-1));//son karakteri yazdiralim
        System.out.println(str.charAt(str.length() - 3));// sondan 3. karakteri yazdiralim

/* javada null pointer bir
deger degil, karsisina yazildigi
variablenin hic bir deger
almadiginin isaretcisidir.
 */
        String str2 = ""; //str2 ye bir deger atanmis midir evet.bu deger nedir hiclik
        System.out.println(str2.length());
        String str3 = null; //str3e bir deger atanmis midir hayir.null bu deger atamayi isaret etmektedir
        System.out.println(str3.length());  //bir deger atanmamis ki nasil uzunlugu olsun
                                            //nullpointerexception olarak hata verir
    }
}
