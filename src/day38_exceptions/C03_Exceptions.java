package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {


    /*
    marketteki tum urunleri bir arrrayde tuttugumuzu varsayalim

   kullaniciya index sorup, o index'teki urunu yazdiran bir program hazirlayalim
   Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim
     */
        String[] urunler = {"nutella", "cokokrem", "sut", "cay", "findik"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("istediginiz urunun sira nosunu giriniz");
        int istenensira=0;
        try {
             istenensira= scanner.nextInt();

        } catch (InputMismatchException e) {
          //  System.out.println("hata mesaji"+e.getMessage());
           //e.printStackTrace();
           // System.out.println("urun indexi icin bir tam sayi girmneiz gerekli");
            System.out.println(e);//hatanin kodunu dondurur
        }
        /*
        catch blogunun onundeki parantezde
        exception clas'inn ismi ve yaninda yakalnan exception'i
        atadimiz variablein ismi olur(e)

        eger yakalanan exception ile ilgili bilgileri
        kullaniciya vermek isterseniz  bu objeyi kullanabilrisiniz
        eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
        e kullanilmasada kod calisir


         */
        System.out.println("program calismaya devam ediyor");
        try {
            System.out.println(urunler[istenensira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("girdiginiz sira listemizde bulunmuyor "+
                    "\nsira numarasi en fazla "+urunler.length +" olabilir");

        }

    }

}
