package lmsSorular;

public class S17 {
    public static void main(String[] args) {
        // Herhangi bir döngü kullanmadan 1'den 100'e kadar olan tam sayıları yazdırmak için bir program yazın
        
        int sayi=100;
        
        yuzeKadarYazdir(sayi);
    }

     static void yuzeKadarYazdir(int sayi) {
        if(sayi>=1){
            System.out.println(sayi);
            sayi--;
            yuzeKadarYazdir(sayi);
        }
    }
}
