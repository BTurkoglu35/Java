package lmsSorular;

public class S01 {
    public static void main(String[] args) {
        /*
        Bir String'de tekrarlanan karakterleri yazdırmak için kod yazın. Örneğin; aksesuarlar ⇒ ces
         */

        String str="aaaleeemm";
        String tekrarlanan="";

        for (int i = 0; i <str.length() ; i++) {
            String c=str.substring(i,i+1);
            if (str.indexOf(c)!=str.lastIndexOf(c)){
                if (!tekrarlanan.contains(c)){
                    tekrarlanan=tekrarlanan+c;
                }

            }

        }
        System.out.println(tekrarlanan);




    }
}
