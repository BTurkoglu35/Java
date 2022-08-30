package day32_StringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilem bir inputu tersine cevirip bize donduren bir method olusturun

        String input="hey gidi for loop gunleri";

      String tersInput= tersineCevir(input);
        System.out.println(tersInput);








    }

    private static String tersineCevir(String input) {
       StringBuilder sb = new StringBuilder(input);
       return sb.reverse().toString();


    }
}
