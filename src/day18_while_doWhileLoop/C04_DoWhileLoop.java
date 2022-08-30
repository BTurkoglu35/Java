package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicidan tamsayilar alin
        //kullanici cift sayi giridigi muddetce sayilari yazdirin
        //tek sayi giridiginde islemi bitirin

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        //while ile yapalim

        //looplarda kullanacgimiz variable lari loop tan once olusturmaliyiz
        //while loopta, looptan once olusturdugumuz bu variable'a atyacagimiz
        //degeri iyi dusunmemiz gerekiyor

     // while (sayi%2==0){
     //     System.out.println("lutfen bir sayi giriniz");
     //      sayi=scan.nextInt();
     //     if (sayi%2==0) {
     //         System.out.println("girilen sayi cift: " +sayi);
     //     }else System.out.println("girilen sayi tek, benden bu kadar");
     // }


        // do while loop ile yapalim
        // do while loop da onceden olusturulan vareable'a hangi deger
        //atandidiginin bir onemi yok, kodumuz her durumda calisir


        //do while'in dezavantaji;
        // ilk calistirma kontrol yapilmadan oldugu icin
        //loopun bodys'inde yanlis bir islem yapilmamasina dikkat etmek gerekir
        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
                System.out.println("girilen sayi cift: " +sayi);
            }else System.out.println("girilen sayi tek, benden bu kadar");

        }while (sayi%2==0);










    }
}
