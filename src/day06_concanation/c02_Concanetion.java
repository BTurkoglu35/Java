package day06_concanation;

public class c02_Concanetion {
    public static void main(String[] args) {
        String str="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str+" " +str2+" "+sayi1+sayi2);
        System.out.println(str+" " +str2+" "+(sayi1+sayi2));
        System.out.println(sayi1+sayi2+" "+str);
        System.out.println(""+sayi1+sayi2+" "+str2);

        System.out.println(str.concat(str2));
        System.out.println(str.concat(  "    ").concat(str2));

        System.out.println("ali "+"can");

    }
}
