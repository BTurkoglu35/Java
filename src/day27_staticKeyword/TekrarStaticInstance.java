package day27_staticKeyword;

import java.util.Random;

public class TekrarStaticInstance {
    int sayi=12;

    static  int rakam=7;

    public static void main(String[] args) {
        TekrarStaticInstance  obj1=new TekrarStaticInstance();
        System.out.println(obj1.sayi);

        obj1.sayi+=3;
        rakam+=3;
        System.out.println(obj1.sayi);//15
        System.out.println(rakam);//10

        TekrarStaticInstance obj2 = new TekrarStaticInstance();
        System.out.println(obj2.sayi);//12
        System.out.println(rakam);//10

        obj2.sayi-=4;
        rakam-=3;

        System.out.println(obj2.sayi);//8
        System.out.println(rakam);//7





    }











}
