package practice_07;

public class Q03_MDArrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int[][] sayilar = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
       toplaCiftSayilar(sayilar);
    }

    private static void toplaCiftSayilar(int[][] sayilar) {
       int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i][j] % 2 == 0) {
                   toplam+=sayilar[i][j];
                }
            }
        }
        System.out.println("cift sayilarin toplami;  "+toplam);
    }











}