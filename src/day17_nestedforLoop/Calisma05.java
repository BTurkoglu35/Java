package day17_nestedforLoop;

import java.util.Scanner;

public class Calisma05 {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis harflerini alin.
        //baslangic ve bitis harfleri arasindaki harfleri buyuk harf olacak sekilde yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen baslangic harfini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen bitis harfinii giriniz");
        char harf2=scan.next().toUpperCase().charAt(0);

        while (harf<=harf2) {
            System.out.print(harf+" ");
            harf++;
        }




    }
}
