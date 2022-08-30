package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalismaSlaytSoru2 {


    public static void main(String[] args) {

        //verilen bir array deki unique elemntleri yeni bir array olarak donduren method yaziniz

           int[] array ={1,2,3,4,5,6,7,2,5};
          int[] array2= unigueElemntleriYazdirma(array);

        System.out.println(Arrays.toString(array2));


    }

    public static int[] unigueElemntleriYazdirma(int[] array) {

        List<Integer> list = new ArrayList<>();
         for(int i=0; i<array.length; i++) {
             list.add(array[i]);
         }

         int sayac=0;
         List<Integer>benzersizSayilar=new ArrayList<>();
         for (int i = 0; i <list.size(); i++)  {
             if (list.indexOf(list.get(i))==list.lastIndexOf(list.get(i))){
                 benzersizSayilar.add(list.get(i));

             }else sayac++;
         }


         int[] benzersiz=new int[array.length-sayac];
         for (int i = 0; i <benzersizSayilar.size() ; i++) {
             benzersiz[i] =benzersizSayilar.get(i);
         }





       return benzersiz;
    }
    }
