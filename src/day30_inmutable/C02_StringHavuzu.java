package day30_inmutable;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str="alican";
        String str2=str+"";
        String str3=new String("alican");
        String hiclik="";
        String str4=str.concat(hiclik);

        System.out.println(str==str2);//false
        System.out.println(str.equals(str2));//true

        System.out.println(str.equals(str3));//true
        System.out.println(str==str3);//falses

        System.out.println(str2.equals(str4));//true
        System.out.println(str2==str4);//false
        /*
         1-yeni bir String olusturuken esitligi saginda new keywordu olursa
        java direk yen bir obje ve referans olusturur
        2- eger esitligin saginda bir method calisiyor veya + islemi yapabiliyorsa
        String inmutable oldugundan g=degisikligi kaydetmek uzere hemen bir kopya
        String olusturur , sonra degeri hesaplayip bu  yeni kopya objenin icine koyar
         */

        String str5="alican";
        String str6=str;

        System.out.println(str.equals(str5));//true
        System.out.println(str5==str);//true

        System.out.println(str.equals(str6));//true
        System.out.println(str==str6);//true3

        System.out.println(str5.equals(str6));//true
        System.out.println(str5==str6);//true

        System.out.println(str==str4);//true


        /*
        eger yeni String objesi olusturuluken new kelimesi kullanilmaz veya
        esitligin saginda + islemi olmazsa java bakar


         */
    }
}
