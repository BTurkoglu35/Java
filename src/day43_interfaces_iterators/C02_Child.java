package day43_interfaces_iterators;

public class C02_Child implements I01_InterfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interfacede abstract olan uc methodu implements ettigimizde java itirazin durdurur.
    sonradan ekledigimiz default veya static keyword ile tanimladigiimiz methodlari implements
    etmememiz sorun olusturmadi
     */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();// static methodu direk interface adi yazarak cagirabiliriz
        C02_Child obj = new C02_Child();// default methodu cagirmak icin obje olusturmaliyiz
        obj.teker();
    }


}
