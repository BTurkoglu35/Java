package day30_inmutable;

import java.util.ArrayList;
import java.util.List;

public class C01_immitableClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("kenan");
        list.add("enes");
        list.add("ismail");
        System.out.println(list);//[kenan, enes, ismail]

        list.set(1,"yasemin");
        System.out.println(list);//[kenan, yasemin, ismail]

        list.remove("ismail");//[kenan, yasemin]
        System.out.println(list);







    }
}
