package day34_inheritance;

public class Nirvana extends Casper {

    protected boolean ekranKarti=true;

    @Override
    public String toString() {
        return
                " \nekranKarti= " + ekranKarti +
                " \nislemci= " + islemci +
                " \nuretimYeri= " + uretimYeri +
                " \nram= " + ram +
                "\n renk= " + renk ;

    }

    protected String islemci="i5 10. nesil";
    public static void main(String[] args) {
        Nirvana bilg=new Nirvana();
        System.out.println(bilg.renk);

        bilg.uretimYeri="kanada";
        System.out.println(bilg.uretimYeri);
        System.out.println(bilg);
    }




}
