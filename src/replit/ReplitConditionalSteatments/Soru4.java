package replit.ReplitConditionalSteatments;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //  1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("gun numarasini giriniz");
        int gun = scan.nextInt();

        if (gun == 1) {
            System.out.println("pazartesi");
        }else if (gun == 2) {
            System.out.println("sali");
        }else if (gun == 3) {
            System.out.println("carsamba");
        }else if (gun == 4) {
            System.out.println("persembe");
        }else if (gun == 5) {
            System.out.println("cuma");
        } else if (gun == 6) {
            System.out.println("cumartesi");
        }else if (gun == 7) {
            System.out.println("pazar");
        } else System.out.println("gecerli bir gun numarasi giriniz");




    }
}
