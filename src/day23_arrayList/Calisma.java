package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calisma {
    public static void main(String[] args) {


        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> ciftSayilar = new ArrayList<Integer>();
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                ciftSayilar.add(sayilar[i]);
            }

        }
        System.out.println(ciftSayilar);


        List<Integer> sayilar1 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

            System.out.println("55"+sayilar1.contains("1"));

        int karelerinTop = 0;
        for (int i : sayilar1) {
            karelerinTop += i * i;
        }
        System.out.println(karelerinTop);


        String str = "asude oyun oynuyor";
        String[] strHarf = str.split("");
        System.out.println(Arrays.toString(strHarf));
        for (String each : strHarf) {
            System.out.print(each + " ");
        }
        System.out.println();
        String[] kelimeler = {"meyve", "sebze", "pazar", "manav"};
        String[] kelimeler2 = {"avm", "laptop", "bilgisayar", "media"};
        List<String> ortakEleman = new ArrayList<String>();

        for (String each : kelimeler
        ) {
            for (String each2 : kelimeler2) {
                if (each.equals(each2)) {
                    ortakEleman.add(each);
                }

            }
        }if(ortakEleman.size()==0){
            System.out.println("ortak eleman bulunamadi");
        }else System.out.println("ortakEleman = " + ortakEleman);


    }}