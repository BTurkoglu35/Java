package day08_ifStatements;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {
/* okula gırebılmek ıcın resım yetenek sınavını veya muzu-ık yeteneke sınavını gecmesı gererkıyor
resım sınavından 60 muzık sınavından 70 alması gerekıyo
 */
        /*Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ders adini giriniz");
        String dersAdi= scan.next().toUpperCase();
        System.out.println("lutfen puaninizi giriniz");
        int puan= scan.nextInt();



        if (dersAdi.equals("RESIM")) {
            if (puan > 60) {
                System.out.println("girmeye hak kazandiniz");
            } else {
                System.out.println("giremedeniz");
            }

        }else if (dersAdi.equals("MUZIK")) {
            if (puan > 60) {
                System.out.println("girmeye hak kazandiniz");
            } else {
                System.out.println("giremediniz");
            }
        }else{
            System.out.println("lutfen gecerli bir ders adi giriniz");
            }
*/
           /*emeklilik kontrolu yapan bir program yaziniz.
        cinsiyet olarak E ve K degiskenlerini kabul etsin
        farkli bir harf veya sembol girilirse hata mesaji versin.

        emeklilik icin kadinlarda yas siniri 60 erkeklerde 65 olsun
        negatif yas veya 80 den buyuk yas girilirse hata mesaji versin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiye giriniz \n erkek icin  E kadin icin K harfi giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yas giriniz");
        int yas=scan.nextInt();

        if (cinsiyet=='E') {
            if (yas<0  || yas>80) {
                System.out.println("gecerli bir yas giriniz");
            }else if (yas<65) {
                System.out.println("emekli olamazsiniz");

            }else{
                System.out.println("emekli olabilrsiniz");
            }

        }else if (cinsiyet=='K'){
            if (yas<0  || yas>80) {
                System.out.println("gecerli bir yas giriniz");
            }
            else if (yas<60) {
                System.out.println("emekli olamazsiniz");
            }
            else{
                System.out.println("emekli olabilrsiniz");
            }
        }else {
            System.out.println("lutfen gecerli bir cinsiyet giriniz");
        }









    }
}
