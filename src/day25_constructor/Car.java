package day25_constructor;

public class Car {
    /*
    bu class bizim kaliphanemiz
    bir araba olustrmak icin ihtiyacimiz olan variable ve merhodlari bu
    classta belrleriz

    sonra farkli classlarda araba olusturmamiz gerekirse bu class dan
    bir obje olustururuz
    burada belirlenen variable ve merhod lara gore araba urtiriz
     */

     public String marka="marka belirtilmedi";
    public String model="model belirtilmedi";
    public int yil;
    public int fiyat;

  public void  benzinliArac(){
      System.out.println("bu arac benzinli motora sahiptir");
  }

  public void maxHiz(int hiz){
      System.out.println("maxHiz"+ hiz+"km dir");
  }








}
