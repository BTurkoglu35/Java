package day19_scope;

public class C02_StaticVariables {


    static int staticsayi=10;
    String isim="mehmet";

    static int degersizStaticVariable;
    int degersizInstanceVariable;

//class leevel'daki vaariablle'lara deger atmamasakta java kabul ediyor

    public static void main(String[] args) {
       //bir variable static olusturulduysa objeler
       //icin degil class icin gecerlidir

        System.out.println(staticsayi);//10
        staticMethod();
        staticsayi=12;
        System.out.println(staticsayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticsayi);

        //instance bir variable'in degerini bulmak icin objenin o;usturulmasindan
        //itibaren istenen satira kadar kodu akip etmeliyiz

        //Static variable'da ise class'in en basindan baslayarak
        // istenen satira kadar kodu tekip edip
        //static variable'in son degerini bulmamiz gerekir


    }

    public static void staticMethod(){
        System.out.println(staticsayi);//10



    }

    public void staticOlmayanMethod(){
        //static variable'lar class icerisinden her yerden ulasilabilr
        //static olsun veya olmasin tum methodlar static variablle'lari
        //gorebilirve degistirilebilrler
        //farkli methodlarda static variable'in hangi degeri alacagini bilmek istiyorsak
        //classin basindan itibaren kodun calismasini takip etmeliyiz
        //method ne zaman cagirilirsa o anki static variable degerini methodda kullanir
        System.out.println(staticsayi);//12

    }


}
