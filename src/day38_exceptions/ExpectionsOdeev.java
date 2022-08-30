package day38_exceptions;

import javax.security.sasl.SaslClient;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpectionsOdeev {
    public static void main(String[] args) {
        /*
        Marketteki tüm ürünleri bir arrayde tuttuğumuzu varsayalım.
        kullanıcıya index sorup, o indexteki ürünü yazdıran jav akodu
        ** Kullanıcı index saysından büyük b,ir sayı girerse Exception vermesin
                 */
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan = new Scanner(System.in);
        int istenenIndex = 0;
        while (true) {
            try {
                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenIndex = scan.nextInt();
                System.out.println("Aradiginiz urun : " + urunler[istenenIndex - 1]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Urun index'i icin bir tam sayi girmeniz gerekli");
                scan.next();
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor \nSira numarasi en fazla : " + (urunler.length) + " olabilir");
                scan.nextLine();
                continue;
            }
        }
    }
}
