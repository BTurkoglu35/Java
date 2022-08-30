package day20_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCevirileri {
    public static void main(String[] args) {
        System.out.println("*******Listi Array'a cevirme");
        List<String> list = new ArrayList<>(List.of("merve","seda","ali"));
        //1.yol
        String[] arr=list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arr));

        //2.yol
        Object[] a =list.toArray();
        System.out.println(Arrays.toString(a));

        //3.yol
        String[] array1=new String[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            array1[i] = list.get(i);

        }
        System.out.println(Arrays.toString(array1));


        System.out.println("********Array'i liste cevirme");

        //1.yol
        List<String> listCeviri=Arrays.asList(array1);
        System.out.println(listCeviri);


        //2.yol
        List<String> listCeviri2=new ArrayList<>();
        for (int i = 0; i <array1.length ; i++) {
            listCeviri2.add(array1[i]);

        }
        System.out.println(listCeviri2);


        System.out.println("*********ornek 1 listten array*********");

        List<String> list1 = new ArrayList<String>(List.of("elma","armut"));
        String[] arrayA =list1.toArray(new String[list1.size()]);
        System.out.println("1  " +Arrays.toString(arrayA));


        Object[] arrayB =list1.toArray();
        System.out.println("2  "+Arrays.toString(arrayB));

        String[] arrayC =new String[list1.size()];
        for (int i = 0; i <list1.size() ; i++) {
            arrayC[i] =list1.get(i);

        }
        System.out.println("3  "+Arrays.toString(arrayC));

        System.out.println("*****ornek1 arraydan list+****");

        List<String> listA=Arrays.asList(arrayA);
        System.out.println("1  "+listA);

        List<String> listB=new ArrayList<>();
        for (int i = 0; i <arrayA.length ; i++) {
            listB.add(arrayA[i]);
        }
        System.out.println("2  "+listB);


        System.out.println("********ornek2 listten array********");
        List<Integer> sayilar=new ArrayList<>(List.of(1,2,5,4,8,6,8));

        Integer[] arraySayilar1=sayilar.toArray(new Integer[sayilar.size()]);
        System.out.println(Arrays.toString(arraySayilar1));

        Object[] arraySayilar2=sayilar.toArray();
        System.out.println(Arrays.toString(arraySayilar2));

        Integer[] arraySayilar3=new Integer[sayilar.size()];
        for (int i = 0; i <sayilar.size(); i++)  {
            arraySayilar3[i] = sayilar.get(i);

        }
        System.out.println(Arrays.toString(arraySayilar3));

        System.out.println("**********ornek2 arrayden list********");

     List<Integer> lisstt1=Arrays.asList(arraySayilar3);
        System.out.println(lisstt1);

        List<Integer> lisstt2=new ArrayList<>();
        for (int i = 0; i <arraySayilar1.length ; i++) {
            lisstt2.add(arraySayilar1[i]);
        }
        System.out.println(lisstt2);

        System.out.println("*******ornek3 listten array********");

        List<String> kalem= new ArrayList<String>(Arrays.asList("pembe","uclu","kisa"));

        String[] kalemAr1=kalem.toArray(new String[kalem.size()]);
        System.out.println(Arrays.toString(kalemAr1));

        Object[] kalemAr2=kalem.toArray();
        System.out.println(Arrays.toString(kalemAr2));

        String[] kalemAr3=new String[kalem.size()];
        for (int i = 0; i <kalem.size(); i++)  {
            kalemAr3[i] = kalem.get(i);
        }System.out.println(Arrays.toString(kalemAr3));

        System.out.println("*********ornek3 arrayden list*****");

        List<String> kalem2=Arrays.asList(kalemAr3);
        System.out.println(kalem2);

        List<String> kalem3=new ArrayList<>();
        for (int i = 0; i < kalemAr3.length; i++) {
            kalem3.add(kalemAr3[i]);
        }
        System.out.println(kalem3);


        System.out.println("*********ornek4 listten array*******");
        List<String> isimler= new ArrayList<String>(Arrays.asList("sefa","berra","rana"));
        String[] isimAr1=isimler.toArray(new String[isimler.size()]);
        System.out.println(Arrays.toString(isimAr1));

        Object[] isimAr2=isimler.toArray();
        System.out.println(Arrays.toString(isimAr2));

        String[] isimAr3=new String[isimler.size()];
        for (int i = 0; i <isimler.size() ; i++) {
            isimAr3[i] = isimler.get(i);

        }System.out.println(Arrays.toString(isimAr3));

        System.out.println("************ ornek4 arraydan list***********");
        List<String> isimler2 =Arrays.asList(isimAr3);
        System.out.println(isimler2);

        List<String> isimler3= new ArrayList<String>();
        for (int i = 0; i <isimAr3.length; i++){
            isimler3.add(isimAr3[i]);

        }
        System.out.println(isimler3);















    }

}
