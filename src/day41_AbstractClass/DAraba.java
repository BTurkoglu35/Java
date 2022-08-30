package day41_AbstractClass;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
        abstract class da main method opsiyoneldir
        eger abstract class sadece child classlarin
        tasimak zorunda oldugu ozellikleri belirlemek icin olusturulduysa
        main method'a ihtiyac olmaz
        sadece abstract method'lar olur

        ama bir abstract method'da standart belirlemek disinda
         da methodlar calisabilr
         bu durumda ihtiyac olursa main method olusturulabilir
         */
    }protected abstract void yakit();
    protected abstract void kaporta();

    protected   abstract void motor();
    /*
    sadece child classlarin mecburi tasiyacaklari ozellikleri belirleyen methodlar abstract method olur.
    Ve abstract method'larin body'si olmaz.
     */

    public void klima() {
        System.out.println("bazi arabalarda klima olabilir");
        /*
        abstract olmayan methodlara concrete method denir.abstract bir methodu
        abstract keywordile belirtmek zorunludur.concrete methodlarda bunun declare edilmesine
        gerek yoktur.biz sadece abstraction ile ilgili konustugumuzda abstract olmayan methodlardan bahsetmek icin
        concrete tabirini kullaniriz.
         */
    }






}
