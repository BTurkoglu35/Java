package day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println(" supra sadece benzin kullanir");
    }
    /*
    private methodlar override edilemez
    eger child class'da parent classdaki private method ile ayni signature da
    bir method olusturursaniz bu overriding method olmaz
     */

    @Override
    void motor() {
     /*
     override notasyonu javaya bir gorev verir
     java bu notasyonla birbirine v=bagli olan iki methodu
      surekli kontrol eder. eger parent classdaki
      overriden methodu silerseniz CTE verir

      override notasyonu kullanmak mecburi degildir
      eger overridding method silinirse kodun CTE
      vermesini istersek override notasyonu kullanmaliyiz
      */
    }
}
