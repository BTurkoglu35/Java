package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

   /*
   list ile calisirken en kotu ozelligi elemanlari tek tek eklemek
    */
    Integer[] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,2,7,0};
    /*
    bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine
    array olusturup,for loop ile olusturdugumuz liste tasiyabilriz
     */

   List<Integer> sayilar=new ArrayList<Integer>();

        for (int i = 0; i <arr.length ; i++) {
           sayilar.add(arr[i]);

        }
        System.out.println(sayilar);//[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 2, 7, 0]

   /*
   bu islemi yapmak icin javanin olusturdugu bir method  da var
   ancak bu yontemin cok yan etkisi var

   1- bu sekilde olusturulan listede add,remove gibi size'i
   degistiren methodlar kullanilmaz
   2- aslist methodu ile olusturulan liste ve kaynak olan array
   biribiri ile ilisik olarak hayatlarina devam ederler.birinde yapptigimiz
   degisiklik, otomatik olarak digerinede isler'
    */
        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);//[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 2, 7, 0]

     //   sayilar2.add(5);
     //   System.out.println(sayilar);

    /*
      sayilar2.add(5);
      System.out.println(sayilar2);
      exception verdigi icin yoruma aldik
     */

        arr[0]=20;
        System.out.println(Arrays.toString(arr));//[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 2, 7, 0]

        System.out.println("arrayde degiisiklik yapinca sayilar2"+sayilar2);//[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 2, 7, 0]

        //Çook önemli....
        // Array'den list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak
        //esnek degildir.Yani array'den olusturdugunuz list'e ekleme ve cikarma yapamazsiniz.
        //list1.add("Emine");//add() yapamazsiniz.Run Time Error verir."UnsupportedOperationExcepti

    }
}
