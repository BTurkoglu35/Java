package day27_staticKeyword;

public class C01 {
    static int sayi=10;
    int rakam=5;
    public static void main(String[] args) {
        /*
        class level'da iki tur variable olusturabilriz
        static (class) variable inctance (obje )variable
        static variable'lar tum classtan kullunilabilrken instance olanlar
        sadece
        static olmayan methodlarda kulllanilabilr.
        instance varable 'lara static methodlardan ulasmak istersek
        obje olusturmamiz grekir

        instance variable'lar obje variable oldugu icin herhangi bir satirda
        instance variable'in degerinn ne oldugunu bulmak icin obje
        olusturlan satirdan itibaren kod incelenmelidir

        Static variable'lar class variable oldugu icin herhangi bir satirda
        static  variable'in degerini bulmak icin classinn basindan itibaren kod
        incelenmelidir
         */

        C01 obj1=new C01();
        System.out.println("obj1'iin rakam degeri : "+obj1.rakam);//5
        System.out.println("obj1'iin sayi degeri : "+sayi);//10


        obj1.rakam+=1;//5+1=6
        sayi+=1;//10+1=11

        System.out.println("obj1'iin rakam degeri : "+obj1.rakam);//6
        System.out.println("obj1'iin sayi degeri : "+sayi);//11

        C01 obj2=new C01();

        System.out.println("obj2'iin rakam degeri : "+obj2.rakam);//5
        System.out.println("obj2'iin sayi degeri : "+obj2.sayi);//11

        obj2.rakam++;//6
        obj2.sayi++;//12

        System.out.println("obj2'iin rakam degeri : "+obj2.rakam);
        System.out.println("obj2'iin sayi degeri : "+obj2.sayi);


    }
}
