package day10_strıngManıpulatıon;

public class Calisma1 {
    public static void main(String[] args) {
     // // CHAR/ TOUPPER_CASE/TOLOWER_CASE
     /* String str="afiyetle ogrenecegiz insallah";
      System.out.println(str.toUpperCase().charAt(3));//Y
      System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
      System.out.println(str.charAt(12));//e
      System.out.println(str.toUpperCase());
      String str2="BUSRA VE MUSTAFA";
      System.out.println(str2.toLowerCase(Locale.forLanguageTag("Tr")));
      String str3="IGDE AGACI";
      System.out.println(str3.toLowerCase(Locale.forLanguageTag("Tr")));
      System.out.println(str3.toLowerCase(Locale.forLanguageTag("Tr")));
      String str4="beni psikopata baglamayin";
        System.out.println(str4.toUpperCase());
      System.out.println(str4.toUpperCase(Locale.forLanguageTag("Tr")));  */


        //EQUALS
        /*String str1="Kitaplar Candir";
        String str2="Kitaplar CANDIR";
        String str3="Kitaplar Candir"+"";
        String str4="Kitaplar Candir";
        String str5=new String("Kitaplar Candir");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str2==str4);//false
        System.out.println(str2.equals(str4));//false
        System.out.println(str1==str5);// false
        System.out.println(str1.equals(str5));// true */


      //equalssignorcase

     /* String str1="Kitaplar Candir";
      String str2="Kitaplar CANDIR";
      String str3="Kitaplar Candir"+"";
      String str4="Kitaplar Candir+";
      String str5=new String("Kitaplar Candir");

      System.out.println(str1.equalsIgnoreCase(str2));
      System.out.println(str3.equalsIgnoreCase(str4));
      System.out.println(str5.equalsIgnoreCase(str1));
      System.out.println(str1.equalsIgnoreCase(str3));*/

      //length
      String str1 ="kitaplar Candir gerisi heyecandir";
      System.out.println(str1.length());
        System.out.println(str1.charAt(str1.length() - 1));
        System.out.println(str1.charAt(str1.length() -18 ));
        System.out.println(str1.charAt(str1.length() -20 ));


    }
}
