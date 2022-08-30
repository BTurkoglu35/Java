package day11_stringManipulation;

public class c05_EndsWith {
    public static void main(String[] args) {
        String str="ah be Java";
        System.out.println(str.endsWith("ava"));//true

        System.out.println(str.endsWith("be Java"));//true

        System.out.println(str.endsWith("ah be Java"));//true

        System.out.println(str.endsWith(""));//true

    }
}
