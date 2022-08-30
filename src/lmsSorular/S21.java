package lmsSorular;

public class S21 {
    public static void main(String[] args) {
       /*
       Bir String dizisinde uzunluğu en küçük olan elemanları bulma
      Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Çıktı Mark, Veli
        */

        String arr[]={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int enKisa=arr[0].length();
        String enKisaKelime="";
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length()==enKisaKelime.length()){
                enKisaKelime=enKisaKelime+" "+arr[i];
            } else if  (arr[i].length()<enKisa){
                enKisaKelime=arr[i]; }

        } System.out.println("enKisaKelime = " + enKisaKelime);
}}