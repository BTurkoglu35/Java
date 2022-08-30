package lmsSorular;

public class S06 {
    public static void main(String[] args) {
      /*
      le verilen ondalık sayının sadece ondalık kısmındaki rakamları yazdırmak için kod yazın.
asteriks. Örneğin; 75.4238 Ş *4*2*3*8
       */

       double sayi=45.745;
       String sayimiz=String.valueOf(sayi);
       int noktaIndex=sayimiz.indexOf(".");
       String noktadanSonra=sayimiz.substring(noktaIndex+1);
       String asteriksli="";
        for (int i = 0; i <noktadanSonra.length(); i++) {

       asteriksli=asteriksli+"*"+noktadanSonra.substring(i,i+1);
        }
        System.out.println(asteriksli);

    }
}
