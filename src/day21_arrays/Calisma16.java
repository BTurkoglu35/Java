package day21_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calisma16 {
    public static void main(String[] args) {
      //  Bir diziyi ArrayList'e dönüştürmek için bir Java programı yazın
    String[] array={"kapi","pencere","sise"};
    List<String> arraylist= Arrays.asList(array);
        System.out.println(arraylist);

        List<String> arraylist2=new ArrayList<>();



        for (int i = 0; i <array.length ; i++) {
            arraylist2.add(array[i]);

        }
        System.out.println(arraylist2);


     // ArrayList'i bir diziye dönüştürmek için bir Java programı yazın.

        List<String>  ihtiyaclar=new ArrayList<>(Arrays.asList("elma","armut","pirasa","havuc"));
        String[] ihtiyaclararr=ihtiyaclar.toArray(new String[ihtiyaclar.size()]);
        System.out.println(Arrays.toString(ihtiyaclararr));

        Object[] ihtiyaclararr1=ihtiyaclar.toArray();
        System.out.println(Arrays.toString(ihtiyaclararr1));

        String[] ihtiyaclararr3=new String[ihtiyaclar.size()];
        for (int i = 0; i <ihtiyaclar.size() ; i++) {
            ihtiyaclararr3[i]=ihtiyaclar.get(i);

        }
        System.out.println(Arrays.toString(ihtiyaclararr3));









    }
}
