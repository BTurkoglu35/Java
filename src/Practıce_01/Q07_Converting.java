package Practıce_01;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {
        /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */
        /*soru1
        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1=gallon+"gallon degeri" +litre+ "litreye esittir";
        System.out.println(sonuc1);*/

        /*int litre =1000;
        double gallon=litre*1/3.785;
        System.out.println(litre+"litre degeri" +gallon+" galona esittir" );*/
        //soru3
        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt degeerini giriniz: ");
        double fahrenayt=scan.nextDouble();
        System.out.println((fahrenayt-32)*5/9);





    }
}
