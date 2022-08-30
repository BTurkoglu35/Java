package day41_AbstractClass;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{
/*
abstract parent silsilesinden gelen ilk concrete class, parenti olan tum classdaki
abstract metodlari concrete hale donusturmek zorundadir.
bu kuralin istisnasi parent classlardan herhangi birinde concretehale donusturulmus
abstractmetodlardir.

 */
public static void main(String[] args) {
    HA160 arb1=new HA160();
    //concrete bir classtan istedigimiz objeyi uretebiliriz
    FMercedes arb2=new FMercedes();
    //mercedeste concrete
    //EToyota arb3=new EToyota();
    //abstract classlar constructor barindirir ama obje uretemezler.toyota classi abstract class oldugundan
    //obje uretilemez
    /*
    List<String> list1 = new List<String>();
    List<String>list2 = new ArrayList<>();
    abstract bir classin ozelliklerini tasiyan bir obje olusturmak
    istedigimizde data turunu istedigimiz abstract class constructori ise childi olan concrete bir class
     */




}}