package day02_variables;

public class Calisma7 {
    public static void main(String[] args) {
        int sayı1 = 20;
        int sayı2 = 10;
        System.out.println(" swap öncesi girdiğiniz sayı1:" + sayı1 + "sayı2:" + sayı2);
        int temp = sayı1;
        sayı1 = sayı2;
        sayı2 = temp;
        System.out.println("swap sonrası sonra girdiğiniz sayı1:" + sayı1 + "sayı2:" + sayı2);
    }
}
