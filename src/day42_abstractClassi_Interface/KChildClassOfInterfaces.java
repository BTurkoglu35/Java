package day42_abstractClassi_Interface;

public class KChildClassOfInterfaces implements I02_Interface,I03_Interface {


    /*
    Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
    implements dedikten sonra virgül sonra yazarak istedigimiz kadar interface ekleyebiliriz
 */

    public static void main(String[] args) {

        System.out.println(I03_Interface.SAYI); // 20

        System.out.println(I02_Interface.SAYI); // 30

        System.out.println(ISIM); // Yildiz Koleji

}}
