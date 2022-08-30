package day18_while_doWhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class Calisma10 {
    public static void main(String[] args) {
        //kullanicidan birsifre girmesini isteyin.sifreyi asagidaki sartlara gore kontrol edin
        //kullanici gecerli bir sifre girene kadar tekrar edin ve gecerli sifre girince
        //"sifrenizi kabul ediyorum" yazdirin
        //-sifre kucuk harf icermelidir
        //-sifre buyuk jarf icermelidir
        //-sifre ozel karakter icermelidir
        //sire en az 8 karakter olmalidir

        Scanner scan = new Scanner(System.in);
        String sifre="0";
        int num=1;
        do{
            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            String sifreB=sifre.toUpperCase();
            String sifreK=sifre.toLowerCase();
            if(( sifreB.equals(sifre)) ){
                System.out.println("sifre kucuk harf icermelidir");
            }else if (sifreK.equals(sifre)) {
                System.out.println("sifre buyuk harf icermelidir");
            }else if ( ((sifre.replaceAll("\\W",""))).equals(sifre)) {
                System.out.println("sifre ozel karakter icermelidir");
            } else if (sifre.length()<8){
                System.out.println("sifre en az 8 karakter olmalidir");
            }else {
                num++;
                System.out.println("Sifreniz kabul edilmistir.");
            }
        }while(num!=2);
    }
}
