package day32_StringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("java");
        StringBuilder sb2=new StringBuilder("java");
        String str="java";

        System.out.println(sb1.equals(sb2));// false

        System.out.println(sb1.equals(sb1));// true

        //StringBuilder'da equals methodu ancak ayni obje olursa true doner
        //String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(str));// false

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("jave");

       System.out.println(sb1.compareTo(sb3));//-4
        /*compareTo() iki StringBuilder i bastan baslayarak
        harf harf karsilastirir.ilk harfler ayni ise ,ikincilere gecer ,
        ikinciler ayni ise 3.lere gecer ve
        ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir.
        eger hic farkli harf yoksa sonuc olarak 0 dondurur.
         */



        StringBuilder str1=new StringBuilder("java guzel");
        StringBuilder str2=new StringBuilder("java lotu");
        System.out.println(str1.compareTo(str2));
;



    }
}
