package day41_AbstractClass;

public class FMercedes extends DAraba{
    @Override
    protected void yakit() {
        /*
        abstract bir parentin concrete child class inherit ederse parent abstract classdaki
        tum abstractmetodlari overrid etmek zorundadir.
        abstract bir class, abstract baska bir classi parent edinirse parent classdaki
        tum abstractmetodlari overrid etmek zorunda degildir
        */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
