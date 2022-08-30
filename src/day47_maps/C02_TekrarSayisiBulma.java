package day47_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        //verilen bir stringdeki kullanilan harfleri ve kullanilan harflerin tekrar saysini H=20 seklinde yazdirin
        String str="Heeeeellllooooo Woooorrrrllllllddddd";
        //spaceleri ve karakterleri saymamasi icin yok edelim
        str=str.replaceAll("\\W","");
        String [] harflerArr=str.split("");

        //harfleri key kullanim adedini value yapalim

        Map<String,Integer>harfKullanimSayilariMap=new HashMap<>();
        int harfKullanimSayisi;
        for (String each:harflerArr) {
            if(!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each,1);


            }else{
                harfKullanimSayisi=harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each,harfKullanimSayisi+1);
            }
        }
        System.out.println(harfKullanimSayilariMap);






    }
}
