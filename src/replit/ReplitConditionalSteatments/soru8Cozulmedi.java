package replit.ReplitConditionalSteatments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru8Cozulmedi {
    public static void main(String[] args) {
        //  Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
        //  Test Data:
        //  Yarım elmas uzunluğu : 7
        //  for (int i = 1; i <=7 ; i++) {
        //      for (int j = 7; j >=i; j--) {
        //          System.out.print(" ");
        //      }
        //      for (int k =1; k <i*2 ; k++) {
        //          System.out.print("*");

        //      }
        //      System.out.println();

        //  }
//verilen bir arrayde istenmeyen  har ficeren kelimelri silip kalan elemntleri yeni bir array yapalim

        String[] arra = {"ankara", "istanbul", "izmir", "bursa", "edirne"};
        String istenmeyen = "d";

        List<String> list = new ArrayList<String>();


        for (int i = 0; i < arra.length; i++) {
            if (!arra[i].contains(istenmeyen)) {
                list.add(arra[i]);


            }
        }
        String[] yeniArray = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            yeniArray[i] = list.get(i);
        }
        System.out.println(Arrays.toString(yeniArray));


    }
}
