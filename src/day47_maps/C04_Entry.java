package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        java Entry<K,V> map'in iceriisnde bulunan her bir kaydi K=v seklinde tutar
        dolayisiyla herhang bir Entry'e  ulastigimizda hem key'e hemde value'ya ulasabilir
        ve istedigimz islemleri yapbilriz

        entry.getKey() bize key'i getirir
        entry.getValue() bize value''yu getirir
        entry.setValue() bize value'yu istedgimiz deger olarak update eder
         */
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        //map'in her bir elemani altalta yazdirin


        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet) {
            System.out.println(each);
        }


     //map'in  tum elemanlarinda varsa tester kurs ismin QA olaarak degistirelim
          String eachValue;
        for (Map.Entry<Integer,String> each:sinifEntrySet) {
            eachValue = each.getValue();
            eachValue=eachValue.replace("tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);
    }
}
