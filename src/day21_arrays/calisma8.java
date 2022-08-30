package day21_arrays;

public class calisma8 {
    public static void main(String[] args) {
        /*
        İlk ve son karakterleri aynı olan dizi öğelerini bulmak için kod yazın
         */

    String[] str={"ala","melek","talat","eleme"};
        for (int i = 0; i <str.length; i++) {

          if(str[i].substring(0,1).equals(str[i].substring(str[i].length()-1))) {
              System.out.println(str[i]);

          }




        }






















    }
}
