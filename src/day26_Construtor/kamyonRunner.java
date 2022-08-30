package day26_Construtor;

public class kamyonRunner {

    public static void main(String[] args) {
      Kamyon kamyon1=new Kamyon();
        System.out.println("kamyonun ozellikleri: "+kamyon1.toString());

     Kamyon kamyon2=new Kamyon("mercedes","4140",2005,500000);
        System.out.println("kamyon2 bilgileri: "+kamyon2.toString());


     Kamyon kamyon3=new Kamyon("man","as900",2007,400000);
        System.out.println("kamyon3: "+kamyon3.toString());


    Kamyon kamyon4=new Kamyon("Scanis","s540");
        System.out.println("kamyon4: "+kamyon4);

    }
}
