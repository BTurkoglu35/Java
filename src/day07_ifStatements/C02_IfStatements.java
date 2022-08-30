package day07_ifStatements;

public class C02_IfStatements {
    public static void main(String[] args) {
        int sayi=40;
        if (sayi>0){
            System.out.println("sayi pozitif");
        }
        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%5==0){
            System.out.println("sayi 5 in tam kati");
        }
        /*basit if cumleleleri kodun diger parcalarindan bagimsizdir sadee
        bir sart kontrol eder, sart saglaniyrsa if body calisir,yoksa calismaz
        birden fazla basit if cumlesi varsa girilen sarta bagli oalark tumunde
        if bodysi calisir,KISMEN if body leri calisabilir, veya hic
        bir if bodysi calismayabilir.
         */

    }
}
