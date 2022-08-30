package practice_13;

import java.util.Arrays;
import java.util.Scanner;

public class Odev4 {
    /*
Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
kullanıcının girdigi bir array'in en buyuk elemani ile
en kucuk elemanının  farkını bulan bir method create ediniz.
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("arrayin uzunlugunu giriniz");
        int sayi = scan.nextInt();
        int[] arr = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.println("array elemanlarini giriniz");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int fark = arr[arr.length - 1] - arr[0];
        System.out.println(fark);


    }
}
