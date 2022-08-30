package day14_methodCreation;

public class Calisma8 {
    public static void main(String[] args) {
        int input=521;
        rakamlarToplami(input);
    }

    public static void rakamlarToplami(int input) {
        int birlerbasamagi=0;
        int rakamlarToplami=0;
        int girilensayi=input;
        birlerbasamagi=input%10;
        rakamlarToplami+=birlerbasamagi;
        input/=10;
        birlerbasamagi=input%10;
        rakamlarToplami+=birlerbasamagi;
        input/=10;
        birlerbasamagi=input%10;
        rakamlarToplami+=birlerbasamagi;
        input/=10;
        System.out.println("Girdiginiz "+girilensayi+" sayisinin rakamlarToplami = " + rakamlarToplami);

    }
}
