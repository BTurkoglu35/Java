package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";
        System.out.println("Car1 bilgileri"+"\nmarka: " + car1.marka+"\nmodel: " + car1.model
        +"\n"+"yil: " + car1.yil+"\n"+"fiyat: " + car1.fiyat);

     Car car2 = new Car();

        System.out.println("Car2 bilgileri"+"\nmarka: " + car2.marka+"\nmodel: " + car2.model
                +"\n"+"yil: " + car2.yil+"\n"+"fiyat: " + car2.fiyat);

        /*
        herhangi bir obje uzerinden bir variable yazdirmaya calistirdigimizda
        java degeri su siralama ile arar
        1- o obje olustrulduktan sonra bir deger atandi mi
        2-objenin olusturuldugu class da variable'aa bir deger atanmis mi bakar
        3-data turune gore java default degeri atar.
         */





    }
}
