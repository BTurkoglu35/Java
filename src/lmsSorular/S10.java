package lmsSorular;

public class S10 {
    public static void main(String[] args) {
        /*
        do-while loo kullanarak 'C'den 'A'ya kadar karakterleri konsola yazdırmak için kod yazın
         */
        char karakter ='C';
        String  karakterler="";

       while (karakter>='A'){
           karakterler+=karakter;
           karakter--;
       }
        System.out.println(karakterler);

       }
}
