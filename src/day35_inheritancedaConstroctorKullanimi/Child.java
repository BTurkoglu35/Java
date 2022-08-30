package day35_inheritancedaConstroctorKullanimi;

public class Child extends AParent {
    String isim = "Child isim belirtilmedi";

    Child() {
        System.out.println("child construtor calisti");
    }

    protected String childKlupAdi = "Child klubu";

    public static void main(String[] args) {


        AGrandParent gp1 = new AGrandParent();
        //bu objeyi olusturmak icin granpa conc. calisir
        //parent ve child  cins. calismaz


        Child child1=new Child();
        child1.granpaKlupAdi="Child";

        child1.parentKlupAdi="Child2";

       //child1. objesi icin child construtor calisti
        /*
           java da bir class'i kullanabilmek icin o class'tan obje olusturur
        dolayisiyla class'in construtor'larini kullanirdik

        java inheritance da parent class'lardaki ozellikleri kullabilmek icin o classlarin
        construtor'larini otomatik calistiran bir yapi kurmustur

        Ornegin biz child classinda child classindan bir obje olusturmak istedigimizde
        child cons.ini kullaniriz

        java child(){} gordugunde once parentin constructor'ini calistirmam lazim der. Buradan paretn 'consa gider
        parennt classinda parent(){} gordugunde once bunun paretnini yani grandParent
       construtor calismasi  gerekir der


         */


    }


}
