package day34_inheritance;

public class Isci extends Personel {
    /*
    normal hayatimizda parent cocuk sahibi olmaya karar verebilir.
    Java da ise child classlar ozelliklerine inherit etmek istedikleri
    classi kendilerinr=e parent edinirler.

    mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    personel classinda ki tum variable ve methodlara ihtiyaci oldugunu gorebilriz
    o yuzden yeniden o variable ve methodlari olusturmak yerine personel
    classini kendimize parent ediniriz

    biz classi parent edinmek icin extends keyword kullanmlaiyiz

    bir class baska bir classi parent edindiginde
    1- parent class'daki tum ozelliklere(variable+method) sahip olur
    2- parent class'daki ozelliklerden bazilarin kendine uyarlayabilir
    3-Parent class'da olmayan bazi yeni ozellikler (variable+method) olusturabilir

    not: parent classlardaki ozelliklerden hic birini reddedemez ama degistirebilir
     */
    int persNo = 1001;


    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim);//Isim belrtilmedi

        isci1.isim = "Selim";
        System.out.println(isci1.isim);
        //kendi class'imizda isim variable'imiz yok o yuzden parent class'ina gidiyoruz.
        System.out.println(isci1.persNo);//1001 kendi class'immizda varsa onu kullaniriz.

        isci1.maas();// tum personelin maasi vardir
        // Isci classinda maas methodu olusturduktan sonra "isciler minimum 15$ saat ucreti alir"

    }
    public  void maas() {
        System.out.println("isciler minimum 15$ saat ucreti alir");
    }
    public void ozelSigorta() {
        System.out.println("iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }
}
