package day48_mapsTheAnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMAps {
    public static void main(String[] args) {


        /*
        eger bir elementle ilgili tutacaginiz bilgiler coksa veya kompleks ise
        bu defa ic ice map kulanmayi tercih edriz

        ic ice map kullandigimizda daha fazla datayi,
        daha duzenli olarak tutma imkanimiz olur
        Ancak, bilgiye ulasmak ve manipule etmek zorlasacaktir

        ornek olarak dunku map,imizi maplerden olusan nir map olarak olusturalim
          sinifMap.put(102, "Enes,cem,tester");
        sinifMap.put(103, "taha,emre,JDev");
        sinifMap.put(104, "Derya,deniz,Devops");
         */

        Map<String, String> ogr101=new HashMap<>();
        ogr101.put("isim","enes");
        ogr101.put("soyisim","cem");
        ogr101.put("brans","tester");


        Map<String, String> ogr102=new HashMap<>();
        ogr102.put("isim","taha");
        ogr102.put("soyisim","emre");
        ogr102.put("brans","JDev");

        Map<String, String> ogr103=new HashMap<>();
        ogr103.put("isim","derya");
        ogr103.put("soyisim","deniz");
        ogr103.put("brans","Devops");

        Map<Integer,Map<String,String>> ogrenciNestedMap=new HashMap<>();

        ogrenciNestedMap.put(101,ogr101);
        ogrenciNestedMap.put(102,ogr102);
        ogrenciNestedMap.put(103,ogr103);


       Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySet=ogrenciNestedMap.entrySet();

        for (Map.Entry each:ogrenciEntrySet) {
            System.out.println(each);
        }

        //102 nolu kisinin ismini yazdiralim

        System.out.println(ogrenciNestedMap.get(102).get("isim"));



    }
}
