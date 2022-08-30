package lmsSorular;

public class S05 {
    public static void main(String[] args) {
//Bir String'deki tüm küçük harfli karakterleri bir asteriks ile yazdırmak için kod yazın.
//Örneğin; 'Ali Can?' ==> l*i*a*n*

        String str="Asude Can";
        String kucukHarf="";
        str=str.replaceAll(" ","");

        for (int i = 0; i <str.length() ; i++) {
            String  a=str.substring(i,i+1);
            if (a.equals(a.toLowerCase())){
                kucukHarf+=a+"*";
            }

        }
        System.out.println(kucukHarf);




    }
}
