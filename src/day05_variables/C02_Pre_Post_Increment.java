package day05_variables;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayı=10;
        System.out.println("pre-increment:  " +  ++sayı);// 11

        System.out.println("post-increment:   " +  sayı++);//11

        System.out.println("post- incremenet sonrasi:  " + sayı);//12
    }

}
