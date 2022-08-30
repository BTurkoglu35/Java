package day21_arrays;

public class Calisma6 {
    public static void main(String[] args) {
        /*
        Belirli bir Dizgede 'a' veya 'A' ile başlayan kaç kelimeyi sayın
         */

    String[] str={"Ali","Veli","asma","arti","sakiz"};
   int sayac=0;

        for (int i = 0; i <str.length ; i++) {

            if (str[i].charAt(0) == 'a'||str[i].charAt(0) == 'A') {
                sayac++;
            }
            }
        System.out.println("sayac = " + sayac);
            
        }














    }

