package practice_09.restuarant;

public class mutfak {


    public String yemekler="adanakebab,urfaciger,kusbasi.kusleme";
    public String araSicaklar="yaylacorba,mercimek,duguncorbasi,corba";
    public String tatlilar="baklava,sutlac,gullac,kazandibi,kunefe";
    public String icecekler="ayran,salgam,kola";

    public mutfak(String adanakebap, String mercimek, String baklava, String ayran) {
    this.yemekler=adanakebap;
    this.araSicaklar=mercimek;
    this.tatlilar=baklava;
    this.icecekler=ayran;



    }
    public mutfak(){

    }

    @Override
    public String toString() {
        return 
                "\nyemekler= " + yemekler + 
                " \naraSicaklar= " + araSicaklar + 
                "\ntatlilar= " + tatlilar +
                "\nicecekler= " + icecekler ;

    
    
    
    
    }
}
