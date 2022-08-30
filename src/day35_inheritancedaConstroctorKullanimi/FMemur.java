package day35_inheritancedaConstroctorKullanimi;

public class FMemur extends EMuhasabe {

    /*
    extends keyword kullanilan classlarda ister default
    constructor bulunsun istersek de biz yeni constructor(lar)
    olusturalimm java constructor'in ilk satirina super() constructor call yazar

    super() constructor call ,default constructor'a benzer
    gorunmesede orada vardir ve calisir ancak biz ilk satira
    farkli bir constructor call hyazarsak java super() constructor call'i siler

     eger biz mudahale edip kendi constructor call'umuzu
     olusturmazsak javaninn default olarak olusturdugu
     constructor call her zaman parametresizdir
     super() constructor call


     */


    FMemur(String isim) {
        System.out.println("memur parametreli cons");

    }

    FMemur() {

        System.out.println("memur parametresiz con");
    }

    public static void main(String[] args) {
        FMemur mmr1 = new FMemur("ali");


    }


}
