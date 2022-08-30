package practice_04;

public class Q01_MethodCreation {
    public static void main(String[] args) {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "abbcccccddddaaaa"
        output: abcd
     */

        String str="abbcccccddddaaaa";
         birkereYazdir(str);
    }

    private static void birkereYazdir(String str) {
        String output="";//String default degeri hiclik oldugu icin isleme etki
        //etmesin diye bu sekilde atama yaptik
        for ( int i= 0; i <str.length(); i++ ) {
          if (!output.contains(str.substring(i,i+1))) {
              output+=str.substring(i,i+1);
          }
        }
        System.out.println(output);
    }
}
