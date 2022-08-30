package practice_13;

public class Q02 {
    /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */

    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input="All is well";

        StringBuilder str=new StringBuilder();
        str.append(input);//stringBuiler methodudur ekleme yapar

        String tersInput=str.reverse().toString();
        System.out.println("ters input"+tersInput);


        System.out.println("2.yol");
        String ters="";
        for (int i = input.length()-1; i >=0 ; i--) {
            ters+=input.charAt(i);

        }
        System.out.println("ters input"+ters);

        terstenYaz(input);


    }

    private static void terstenYaz(String input) {
        String ters="";
        for (int i = input.length()-1; i >=0 ; i--) {
            ters+=input.charAt(i);

        }
        System.out.println("ters input"+ters);

    }


}
