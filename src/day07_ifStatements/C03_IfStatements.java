package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        int sayi = 23;

        if (sayi > 0)
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir");// her zaman calisir
        System.out.println("ucuncu satir");// her zaman calisir

        if (sayi % 2 == 0)
            System.out.println("sayi cift");
        System.out.println("cift kalacaktir");//her zaman calisir


        if (sayi % 5 == 0)
            System.out.println("sayi 5 in tam kati");


        /*bir if steatmentsda { kulanollmazsa java ilk satiri
        sart ile baglar, sonraki   satirlar bagimsiz olur.
        Eger birden fazla  satir if sartina baglanmissa { parantez
        kullanilmalidir.
         */
    }

}
