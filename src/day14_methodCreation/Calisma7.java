package day14_methodCreation;

public class Calisma7 {
    public static void main(String[] args) {
        //  Üçün katları için 'Fizz' ve beşin katları için 'Buzz' döndüren bir yöntem yazın.
        //  Hem üç hem de beşin katı olan sayılar için 'FizzBuzz' döndürülür.
        //İkisi de olmayan sayılar için giriş numarasını döndürün.

        int input = 13;

        String sonuc = FizzBuzz(input);
        System.out.println(sonuc);

    }

    private static String FizzBuzz(int input) {
       String str="";
        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (input % 5 == 0) {
            System.out.println("Buzz");
        } else if (input % 3 == 0) {
            System.out.println("Fizz");
        } else System.out.println("tekrar giris yapiniz");
        return str;
    }
}