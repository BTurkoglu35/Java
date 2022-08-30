package day22_multiDimensionalArray;

public class calisma6 {
    public static void main(String[] args) {
        //Bir dizinin belirli bir değer içerip içermediğini test etmek için bir Java programı yazın
        int[] array = {124, 65, 789, 45, 636};
        int aranan = 450;
        containss(array, aranan);
        System.out.println(containss(array, aranan));

    }

    public static boolean containss(int[] array, int aranan) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == aranan) {
                return true;
            }

        }
        return false;
    }
}