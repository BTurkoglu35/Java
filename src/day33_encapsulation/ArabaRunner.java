package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1. objesi uzerinden marka variable'ina ulasabildim,degistirebildim(set) ve yazdirabildim(get) .
        arb1.marka="toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable'ina ulasimi
        //taamamen serbest yapabilir veyA tamamen engelleyebilirim.
        //private yaptigimiz mi=odele hic ulasamayiz
        //access modifier ya heptir ya hictir

        //modeli degistirelim ama gormemyelim
       // yakitida gorelim ama degistiremeyebilrim


        //set ve get yetkilerini ozel olarak tenimlamak isterserseniz
        //1. adim yetki tanimlayacagininz variable'lari private yapin'
        //        private bir dataya baska classlardan ulasmak mumkun olmadigindan
        //2. adim -set yetkisi icin setter, get yetkisi icin getter methodlarini kullanalim


       arb1.setModel("corolla");    //moodel olarak suprayi atadik
        //modeli yazdirma imkanimiz yok , cunku getter yok
        System.out.println(arb1.getYakit());//elektirikli bilgisini yazdirabildik
        //yakiiti degistrimeyiz cunku setter methodu yok


    }
}
