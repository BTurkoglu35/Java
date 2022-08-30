package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        //soyismi can olanlarin bransini dataScience yapalim

        Map<Integer,String> sinifLisMaps= ReusableMethods.mapOlustur();

        //entry olusturalim

        Set<Map.Entry<Integer,String>> entrySeti=sinifLisMaps.entrySet();

        String entryValue;
        String[]arr;
        for (Map.Entry<Integer,String> entry : entrySeti) {
            entryValue=entry.getValue();
            arr=entryValue.split(",");
            if(arr[1].equals("can")){
                arr[2]="dataScience";
                entry.setValue(arr[0]=","+arr[1]+","+arr[2]);
            }


        }
        System.out.println(sinifLisMaps);
    }
}
