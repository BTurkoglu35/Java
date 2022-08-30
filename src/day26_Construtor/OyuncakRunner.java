package day26_Construtor;



public class OyuncakRunner {
    public static void main(String[] args) {
    Oyuncak oyuncak = new Oyuncak();
        System.out.println("Runner = " +oyuncak.toString());

   Oyuncak oyuncak2=new Oyuncak("niloya","bebek",15,100);
      System.out.println("Oyuncak2 bilgileri"+oyuncak2.toString());


   Oyuncak oyuncak3 = new Oyuncak("Car","Araba");
      System.out.println("Oyuncak3 bilgileri"+oyuncak3.toString());

      Oyuncak oyuncak4 = new Oyuncak("Car");



    }









}
