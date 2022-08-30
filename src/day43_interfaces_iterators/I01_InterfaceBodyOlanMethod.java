package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

   /*
   normal bir classda oldugumuzu dusunursek iki tane access modifier kullanma ihtimali olmaz

   asagidaki method'da goreceginiz gibi interfacede istisnai olarak body'si olan methodlar olusturulabilir.
   Bu ozellik Java 8'den sonra bir interface yeni bir method eklememiz gerektiginde  eskiden beri bu interface'i
   implement eden tum class'lara gidip yeni eklenen methodu override etmemiz gerekirdi.

   Bu ozellik sayesinde basina default veya static keyword ekleyerek interface'de yeni ve body'si olan method
   olusturursak bu methodun child classslar tarafindan override edilme mecburiyeti olmaz.
   ve eskiden implement etmis classlari degistirmemiz gerekmez.

   bu istisnai bir durumdur ve interface icin olusturulan genel kurallari bozmaz.

   Bu methodlarin body'si olsada bunlara concrete methodlar denmez ama override edilme mecburiyetleri yoktur

   buradaki default kelimesi access modifier degil istosnai durumun belirtilmesi icindir.

   o zaman nicin 2 keyword (static ve default) tanimlanmistir?
   Bu iki farkli kelimenin amaci child classslar'dan bu method'a nasil erisilebilecegini belirlemek icindir
   static keyword kullanilirsa , child classdam bu methoda erismek icin interfaceAdi.methodAdi hyeterli olur

   default keyword kullanilirsa ,methoda erismek icin obje olusturulmalidir.
    */

    public default void teker(){
        System.out.println("default tum arabalarin tekeri vardir");

    }
    public  static void direksiyon(){
        System.out.println("static tum arabalarin direksiyonu vardir");
    }
}
