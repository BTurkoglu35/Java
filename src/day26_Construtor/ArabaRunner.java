package day26_Construtor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        // bir gun onceki car classindan obje olusturalim

        /*
        Farkli bir package'dan bir class'dan obje olusturdugumuzda
        acseee modifierleri da dikkate almaliyiz
         */
        Car car1=new Car();
        System.out.println(car1.fiyat);

        /*araba class'indan bir obje olusturdugumda eger default consrrucor
        kullanildiysa tum ozellikler icin tek tek deger atamak zorunda kalo=iriz
        */
          Araba araba1=new Araba();
          araba1.fiyat=100000;
          araba1.marka="mercedes";
          araba1.yil=2000;
          araba1.model="c180";

        System.out.println("Araba1 bilgileri"+"\nmarka: " + araba1.marka+"\nmodel: " + araba1.model
                +"\n"+"yil: " + araba1.yil+"\n"+"fiyat: " + araba1.fiyat);
        /*
        eger bir objeyi olusturuken bazi ozelliklerini argument olarak belirtip
        o ozelliklerde bir obje olusturmak istersek java itiraz eder
        cunku her classda default constructor vardir ama o da parametresizdir
         */
         Araba araba2=new Araba("BMW","5.20",2011,15000);

        System.out.println("Araba2 bilgileri"+"\nmarka: " + araba2.marka+"\nmodel: " + araba2.model
                +"\n"+"yil: " + araba2.yil+"\n"+"fiyat: " + araba2.fiyat);


        Araba araba3=new Araba("opel","astra",2015,78000);
        System.out.println("Araba3 bilgileri"+"\nmarka: " + araba3.marka+"\nmodel: " + araba3.model
                +"\n"+"yil: " + araba3.yil+"\n"+"fiyat: " + araba3.fiyat);







    }


    }

