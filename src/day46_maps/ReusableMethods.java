package day46_maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer, String> mapOlustur() {
        Map<Integer, String> sinifMap = new HashMap<Integer, String>();

        sinifMap.put(101, "Ali,can,JDev");
        sinifMap.put(102, "Enes,cem,tester");
        sinifMap.put(103, "taha,emre,JDev");
        sinifMap.put(104, "Derya,deniz,tester");
        sinifMap.put(105, "Fatma,deniz,Devops");
        sinifMap.put(106, "Emre,can,tester");
        sinifMap.put(107, "Hamza,eren,JDev");

        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each : ogrenciMap.values()) {
            System.out.println(sira + "-" + each);
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {

        List<String> methoddakiList = new ArrayList<String>();
        String[] eachArr;
        for (String each : ogrenciMap.values()) {
            eachArr = each.split(",");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        //brans=brabnstaki ogrenci sayisi
        Map<String, Integer> bransOgrenciSayisi = new TreeMap<String, Integer>();

        Collection<String> valuesCollection = sinifListMap.values();
        String[] valueArray;
        String brans = "";
        Integer branstakiOgrenciSayisi;
        for (String each : valuesCollection) {
            valueArray = each.split(",");
            brans = valueArray[2];
            // bransin bu mapde key olarak daha onceden eklenip eklenmedigini kontrol etmeliyiz
            if (!bransOgrenciSayisi.containsKey(brans)) {
                bransOgrenciSayisi.put(brans, 1);
            } else{
               branstakiOgrenciSayisi= bransOgrenciSayisi.get(brans);
               bransOgrenciSayisi.put(brans,branstakiOgrenciSayisi+1);
            }

        }
        System.out.println(bransOgrenciSayisi);
    }

    public static void entryYAzdir(Map<Integer, String> sinifListesiMap) {

        Set<Map.Entry<Integer, String>>sinifListEntrySeti=sinifListesiMap.entrySet();

        for (Map.Entry<Integer, String> entry : sinifListEntrySeti) {
            System.out.println(entry);
        }



    }
}