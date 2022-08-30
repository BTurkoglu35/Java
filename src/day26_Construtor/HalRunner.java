package day26_Construtor;

public class HalRunner {
    public static void main(String[] args) {
        Hal elma1=new Hal();
        System.out.println(elma1.toString());

        Hal elma2=new Hal("amasyaelmasi","amasya",15,true,"sari");
        System.out.println(elma2.toString());


        Hal elma3=new Hal("balyanak","ankara",false);
        System.out.println(elma3.toString());

    }
}
