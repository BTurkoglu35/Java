package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
          System.out.println(str);
          deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
          java compile time'da bunu farkeder ve size izin vermez
        */
        str=null;
      //  System.out.println(str.length());//NullPointerException=>run time exception

      Object obj="java java java";
      Integer sayi=(Integer )obj;// ClassCastException


    /*
     String str2="hava Civa";
      Integer sayi2=str2;

      java bazi casting islemlerine compile time da izin vermez

      ancak bazen syntex uygun olablir
      bu durumda java kodun calismasina itiraz etmez


     */

    Thread.sleep(1000);//throws InterruptedException







    }
}
