package day09_ternary;

public class Calisma1 {
    public static void main(String[] args) {
        //kullanıcıda ıkı sayı alın ve buyuk olmayanı yazdırın

       /* Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");
        int sayi = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(sayi>sayi2?sayi:sayi2);*/

        //kullanniicidan bir tam sayi alin ve sayininn tek veya cift oldugunu yazdirin

        /*Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi%2==0? "cift":"tek");*/

        //kullanniicidan bir  tamsayi sayı alin ve sayinin mutlak degerini yazdirin

/*
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi sayı giriniz");
        int sayi = scan.nextInt();
         sayi= sayi>0?sayi:sayi*-1;
        System.out.println(sayi);*/


        //kullanicidan bir sayi alin ; sayi pozo=itif ise "sayi pozitif" degilse
        //negatifse sayinim karesini yazdirin
        /*Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi>0?" sayi pozitif":sayi*sayi);*/

        //nested ternary
        //kulannicidan bir harf isteyin
        //kucuk harf ise konsola kucuk harf
        //buyuk harf ise konsola  buyuk harf
        //yoksa girdiginiz karakter harf degil yazdirin

        /*Scanner scan=new Scanner(System.in);
        System.out.println("lutsfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z'?"kucuk harf":harf>='A' && harf<='Z'? "buyuk harf": "gecerli bir karakter giriniz");*/

        //kulanicisan bir tamsayi alin
        // sayi 10 dan kucukse rakam
        // sayi 100 dan kucukse iki basamakli sayi
        //degilse uc basamakli sayi

       /* Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi<10?"rakam":sayi<100?"iki basamakli sayi":sayi<1000?"uc basamakli sayi": "gecerli sayi giriniz");*/

        String input="hhh";
        switch (input) {
            case "pazartesi":
                System.out.println("pazartesi");
                break;
                case "sali":
                System.out.println("sali");
                break;
                case "carsamba":
                System.out.println("carsamba");
                break;
                case "persembe":
                System.out.println("persembe");
                break;
                case "cuma":
                System.out.println("cuma");
                break;
                case "cumartesi":
                System.out.println("cumartesi");
                break;
                case "pazar":
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli bir gun giriniz");

        }





    }
}
