package day34_inheritance;

public class S500 extends Nirvana {

    @Override
    public String toString() {
        return
                "\nekranKarti= " + ekranKarti +
                "\nislemci= " + islemci +
                "\n uretimYeri= " + uretimYeri +
                "\n ram= " + ram +
                "\n renk= " + renk;

    }

    public static void main(String[] args) {


 S500 yeniBilg=new S500();
        yeniBilg.ekranKarti=false;
        System.out.println(yeniBilg);


    }}
