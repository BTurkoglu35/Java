package day34_inheritance;

public class  ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child class'dan parent class'a erisimde acces modifier kurallarini
        bypass edemeyiz. ornegin parent classdaki private class uyelerini
        child classdan kullanamayiz
        ayni sekilde parent ve child farkli package'larda ise parent class'daki
        default acces modifier'i olan class uylerini child classdan kullanamayiz
         */

        ToyotaCorolla arb1=new ToyotaCorolla();
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.model);//model belirtilmedi







    }


}
