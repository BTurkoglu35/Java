package lmsSorular;

public  class S24 {
    public static void main(String[] args) {
            /*
            Belirli bir Dizede kaç kelimenin 'a' veya 'A' ile başladığını sayın
             */

        String arr[] = {"Ali", "Fatma", "aliye", "Amine", "Zeki"};
        int sayac = 0;
        for (String each : arr) {
            if (each.startsWith("a") || each.startsWith("A")) {
                sayac++;
            }
        }
        System.out.println(sayac);

    }}