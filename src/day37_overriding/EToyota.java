package day37_overriding;

public class EToyota extends DAraba {
    @Override
    void marka() {
       /*
        super.marka();
        eger hem overrridden hem de overrising methodun calismasini
        istersek ilk satira super.marka(); yazabilirz
        */
        System.out.println("markamiz toyota");
    }

    void motor(){
         System.out.println("toyota araclar toyota marka motor kullanir");
     }

}
