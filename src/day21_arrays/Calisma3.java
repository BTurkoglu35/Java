package day21_arrays;

public class Calisma3 {
    public static void main(String[] args) {
    //   Bir String dizisinde uzunluğu en küçük olan elemanları bulun
    //   Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Çıktı Mark, Veli

     String[] isimler={"Derya","Ali","Mert","Asudemm"};

      String enUzunKelime=isimler[0];
      String enKisaKelime=isimler[0];

        for (int i = 1; i <isimler.length; i++) {

        if(isimler[i].length()<enKisaKelime.length()){
            enKisaKelime=isimler[i];
        }
        if(isimler[i].length()>enUzunKelime.length()) {
            enUzunKelime=isimler[i];
        }


        }
        System.out.println("enKisaKelime = " + enKisaKelime);
        System.out.println("enUzunKelime = " + enUzunKelime);;





















    }
}
