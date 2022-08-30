package lmsSorular;

public class S02 {
    public static void main(String[] args) {
        /*
        Bir String'in palindrom olup olmadığını kontrol etmek için kod yazın. Eğer bir String aynı ise
      ters ise palindrom olarak adlandırılır. Örneğin; "anna", "123321" palindromdur
         */

        String str="sart tras";
        String ters="";

        for (int i = str.length()-1; i >=0; i--) {
            ters += str.substring(i,i+1);

        }
        if (ters.equals(str)) {
            System.out.println("palindrom kelimedir");
        }else System.out.println("palindrom kelime degil");


        // ikinci yol

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String ters2=sb.reverse().toString();
        if(ters2.equals(str)){
            System.out.println("palindrom kelime ");
        }else System.out.println("palindrom kelime degil");










    }
}
