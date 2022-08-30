package lmsSorular;

public class S11 {
    public static void main(String[] args) {
        /*
        Bir tamsayının benzersiz rakamlarının toplamını bulmak için kod yazın
Örnek: 12133455 Ş 2+4=6
         */
        int sayi = 1245124;
        String sayimiz = String.valueOf(sayi);
        int benzersizTop = 0;
        for (int i = 0; i <sayimiz.length() ; i++) {
            String Iindex=sayimiz.substring(i,i+1);
            if (sayimiz.indexOf(Iindex)==sayimiz.lastIndexOf(Iindex)){
                benzersizTop+=Integer.valueOf(sayimiz.substring(i,i+1));
            }
        }
        System.out.println(benzersizTop);
















    }}