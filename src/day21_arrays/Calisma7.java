package day21_arrays;

public class Calisma7 {
    public static void main(String[] args) {
        /*
        Bir dizedeki sesli harf sayısını bulun
         */

        String str="Hayat sevince guzel";
        String[] str1=str.split("");
        int sayac=0;

        for (int i = 0; i < str1.length ; i++) {

          if (str1[i].equals("a") || str1[i].equals("e")|| str1[i].equals("i")
          || str1[i].equals("o")|| str1[i].equals("u")){
              sayac++;
              System.out.print(str1[i]);
          }


        }
        System.out.println();
        System.out.println(sayac);
















    }
}
