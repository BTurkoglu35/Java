package day26_Construtor;

public class Araba {
    public String marka = "marka belirtilmedi";
    public String model = "model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka = markaR;
        model = modelR;
        yil=yilR;
        fiyat = fiyatR;
    }


    /*
    biz herhangi bir constroctor olusturdugumuzda java default constructor'i siler
    eger biz projemizde sorun yasanmasini istemiyorsak default constructor
    yerine parametresiz constructor olusturmaliyiz
     */
 public Araba(){

}
    public void  benzinliArac(){
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("maxHiz"+ hiz+"km dir");










    }
}
