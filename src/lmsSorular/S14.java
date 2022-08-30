package lmsSorular;

import java.util.Scanner;

public class S14 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir String ve bir karakter alın
karakterinin ilk geçtiği yer ile son geçtiği yer arasındaki karakter sayısını sayar.
String'de verilen karakter
Boşluk karakterlerini saymayın
Kullanıcının seçtiği karakter String içinde sadece bir kez görüntüleniyorsa -1 döndürür
Kullanıcının seçtiği karakter String içinde mevcut değilse -1 döndürür
Örneğin; "Java kolaydır" - 'a' ==> 5
 "Java kolaydır" - 'w' ==> -1
 "Java kolaydır" - 'e' ==> -1

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = scan.nextLine();
        System.out.println("lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        str = str.replaceAll("\\s", "");
        int ilkIndex = str.indexOf(karakter);
        int sonIndex = str.lastIndexOf(karakter);
        int sayac = 0;


        if (sonIndex == ilkIndex){
            System.out.println("-1");

         }else if (sonIndex!=ilkIndex) {
            System.out.println((sonIndex) - (ilkIndex + 1));

        }
    }
}
