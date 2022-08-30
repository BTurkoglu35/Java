package day29_passByValue;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        immutable:degistirilemez
        mutable  :degistirilebilir

        en meshur inmutable class: String

         */

        String str="Yildiz Bank";

        System.out.println(str.toUpperCase()); //YILDIZ BANK

        str.toLowerCase();
        System.out.println(str);//Yildiz Bank

        str.substring(3,5);//sout olmadigindan yazdirmaz, di
        System.out.println(str);//Yildiz Bank

        //java da String gibi metin ifadelerde l=kullanabailecegimiz
        //mutable StringBuilder class'i da vardir

        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb);//Java Bank

        sb.reverse();

        System.out.println(sb);//knaB avaJ
        sb.append(".");
        System.out.println(sb);//knaB avaJ.




    }
}
