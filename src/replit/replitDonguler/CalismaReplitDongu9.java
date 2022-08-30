package day16_forLoop;

public class CalismaReplitDongu9 {
    public static void main(String[] args) {
    //   Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
    //   Input :1238
    //   output :Girilen Numananin Tersi: 8321

        String sayi="1338";
        String ters="";

        for (int i =sayi.length()-1; i>=0; i--) {
            ters=sayi.substring(i,i+1);
            System.out.print(ters);
        }








    }
}
