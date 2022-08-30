package day19_scope;

public class C01_InstanceVariables {

    //class icerisnde heryerdn kulllanmak istediginiz variable'lari
    //class level'da(classsin icinde ve methodlarin disinda )
    //genellikle class level variable lar classin basida olusturulir(sart deegil)

    //class level'daki variable'lar icin iki scope vardir
    //1= static variables (class variablle'lari da denir)
    //2-instance (static olmayan)variables(obje variabllari da denir)



    int instSayi=20;//static olmayip class level da oldugu icin instance variable'dir



    public static void main(String[] args) {
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degismeden once"+obje1.instSayi);
        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra"+obje1.instSayi);

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degismeden once"+obje2.instSayi);
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra"+obje2.instSayi);

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degismeden once"+obje3.instSayi);
    //her obje olustugunda instance yani obje variable'nin ilk atanan degerini alir


    }
    public static void staticMethod() {
        //System.out.println(sayi);
        //bir methodun icerisinde olusturulan variable
        // sadece o methodun icinden kullanilabilr(local variables)

        //instSayi=30;
        //instance variable'lara main method disindaki static methodlardan
        // direk ulassmayiz,obje olusturursak ulasabilriz

        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println("obje4 degismeden once"+obje4.instSayi);


    }

    public void staticOlmayanlarMethod() {

        System.out.println(instSayi);
        //instance variablle'lara class icerisindeki statik olmayan methodlar
        // icersinden direk ulasabilirz





    }

}
