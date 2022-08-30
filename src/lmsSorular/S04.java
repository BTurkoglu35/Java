package lmsSorular;

public class S04 {
    public static void main(String[] args) {
        //20'den 3'e kadar tek tamsayıları aynı satırda, aralarında bir boşluk bırakarak yazdırmak için kod yazın
        //Ardışık olanlar.

        String s = "";
        for(Integer i=20; i>2; i--){
            if(i%2!=0){
                s = s + i + " ";
            }
        }
        System.out.println(s);





    }
}
