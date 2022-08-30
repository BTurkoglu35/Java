package day41_AbstractClass;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
    /*
    toyota classinin 2 tane paretn'i var
    corolla paertnlarinin ikisinin de standartlarina (abstract method) uymak zorundadir

    concrete bir class parenti olan tum abstract classlarda abstract olan methodlari implement etmek zorundair
    Ancak parent silsilesinde override edilerek concrete yapilan methodlari override etmek zorunda degildir

     */
}
