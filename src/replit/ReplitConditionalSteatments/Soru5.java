package replit.ReplitConditionalSteatments;

import java.util.Scanner;

public class Soru5 {
    //  1 ile 12 arasında girilen sayıdan ve yıldan yılın hangi ayı olduğunun
    //  ve o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ay numarasi giriniz");
        int ay = scanner.nextInt();
        System.out.println("lutfen yil giriniz");
        int yil = scanner.nextInt();

        if (ay == 1) {
            System.out.println(yil + "yili ocak ayi 30 gun");
        } else if (ay == 2) {
            if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0) {
                System.out.println(yil + " yili subat ayi 29 gun");
            } else System.out.println(yil + " yili subat ayi 28 gun");
        } else if (ay == 3) {
            System.out.println(yil + "  mart ayi 31 gun");
        } else if (ay == 4) {
            System.out.println(yil + " yili nisan ayi 30 gun");
        } else if (ay == 5) {
            System.out.println(yil + " yili mayis ayi 31 gun");
        } else if (ay == 6) {
            System.out.println(yil + " yili haziran ayi 30 gun");
        } else if (ay == 7) {
            System.out.println(yil + " yili temmuz ayi 31 gun");
        } else if (ay == 8) {
            System.out.println(yil + " yili agustos ayi 31 gun");
        } else if (ay == 9) {
            System.out.println(yil + " yili eylul ayi 30 gun");
        } else if (ay == 10) {
            System.out.println(yil + " yili ekim ayi 31 gun");
        } else if (ay == 11) {
            System.out.println(yil + " yili kasim ayi 30 gun");
        } else if (ay == 12) {
            System.out.println(yil + " yili aralil ayi 31 gun");

        }else System.out.println("gecerli bir ay giriniz");


    }


}
