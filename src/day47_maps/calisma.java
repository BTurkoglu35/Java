package day47_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calisma {
    public static void main(String[] args) {
        List<String> deneme=new ArrayList<String>(Arrays.asList("ali can","ayse nur","mehmet can"));
        String degis ="";
        for (String each:deneme) {
            degis=each;
            degis=degis.replace("can","han");
           deneme.set(deneme.indexOf(each),degis);
        }
        System.out.println(deneme);








    }
}
