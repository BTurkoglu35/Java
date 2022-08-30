package day25_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen();
        System.out.println(ogretmen1);
        
         Ogretmen ogretmen2=new Ogretmen("emre","akdogan","1/1/1993",
          "matematik","fizik"       );
        System.out.println("ogretmen2 = " + ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Cavidan","Kabinkara","1/1/1993");
        System.out.println("ogretmen3 = " + ogretmen3);
        

        


    }
}
