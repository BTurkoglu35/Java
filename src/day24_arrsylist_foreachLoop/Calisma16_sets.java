package day24_arrsylist_foreachLoop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Calisma16_sets {
    public static <list> void main(String[] args) {
      //  Bir Dize'de kullanılan farklı karakterleri yazdırmak için kod yazın  Örnek: 'Mississippi' Ş Misp
       // Type code to print different characters used in a String Example: ‘Mississippi’ Ş Misp

   String word="Mississippi";
   String[] wordArray=word.split("");//[M, i, s, s, i, s, s, i, p, p, i]
        List<String> wordList =Arrays.asList(wordArray);


        HashSet<String> mySet =  new HashSet<String>(wordList);
        System.out.println(mySet);






    }
}
