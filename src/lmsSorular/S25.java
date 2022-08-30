package lmsSorular;

public class S25 {
    public static void main(String[] args) {
        /*
        Bir Dizgideki sesli harflerin sayısını bulma
         */

        String str="asude";
        String arr[]=str.split("");
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {

            switch (arr[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    sayac++;

            }
        }
        System.out.println(sayac);

    }
}
