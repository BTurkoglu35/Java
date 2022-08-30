package day21_arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
        binarySearchnmethod'u siralanmis array'de aradiginiz elementinn indexini dondurur

        ya aradigimiz elemennt array'de yoksa?
        (String de indexOf() bize olmayan elementler icin -1 donuyordu)

        aradigimiz element array'da yoksa java hmm olmadigini hemde ololsaydi
         nerde olacagini bize dondurur

         olmadigini ifade icin - kullanir
         olsaydi nerede olacagini belirtmek icin index degil siralama  kullanir
         */

        int[] sayilar={3,7,15,4,27,10,4};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//{3,4,7,10,15,27}
        //varsa index ,yoksa -sira

        System.out.println(Arrays.binarySearch(sayilar,4));//1

        System.out.println(Arrays.binarySearch(sayilar,15));//4

        System.out.println(Arrays.binarySearch(sayilar,11));//-5

        System.out.println(Arrays.binarySearch(sayilar,6));//-3

        System.out.println(Arrays.binarySearch(sayilar,-100));//-1











    }
}
