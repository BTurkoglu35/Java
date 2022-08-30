package day41_AbstractClass;

public abstract class EToyota extends DAraba{

    @Override
    protected void motor() {
        System.out.println("toyota arabalar cevreci motor kullanir");
        /*
        parent classdaki standart belirleyici metodlar(abstract metod) LARIN TAMAMI CHILD CLASS TARAFINDAN OVerride edilmelidir.

        concrete metodlarin overrid edilm mecburiyeti yoktur.
        istersek overrid ederiz istemessek etmeyiz,

        aslinda toyota classida obje uretecegimix bir class degil bu durumda eger bir
        proje tasarimi yapiyorsaniz toyota classini da abstract yapmamiz guzel olur

         */

    }
}
