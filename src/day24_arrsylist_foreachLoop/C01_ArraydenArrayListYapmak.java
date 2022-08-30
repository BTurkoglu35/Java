package day24_arrsylist_foreachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr={"ismail","nurullah","fatih"};

        /*
        uzun listeler olusturmamiz gerektiinde tek tek eklemek  yerine array olusturup
        bunlari liste cevirmek daha pratik olabilr
        1-loop ile array'daki tum elementleri list'e atabiliriz
        2- Arrays.aslist() kullanabiliriz
        Ancak bu methodun 2 tane yan etkisi var
        -Arrays classi kullanildigi icin array ozellikleri gecerli olur
        dolaysiyla liste olan add , remove gibi size'i degistiren method'lar
        bu sekilde olsturulan list'lerde kullanilamaz
        -kaynak olan array ile urun oln list ozdeslestirilir
         */
         List<String> siniflist= Arrays.asList(arr);
        System.out.println(siniflist);//[ismail, nurullah, fatih]

        //1.yan etki
       // siniflist.add("erdi");//UnsupportedOperationException

     //   siniflist.remove(1);
     //   System.out.println(siniflist);//UnsupportedOperationException

      //2.yan etki
    arr[1]="emre";
        System.out.println("degisim sonrasi array;" +Arrays.toString(arr));
        System.out.println("Arrayi degistirince list: "+siniflist);

      siniflist.set(0,"utku");
        System.out.println("Arrayi degistirince list: "+siniflist);
        System.out.println("listi degistirilince array:  "+Arrays.toString(arr));



    }
}
