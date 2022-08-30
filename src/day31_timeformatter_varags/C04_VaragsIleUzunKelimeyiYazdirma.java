package day31_timeformatter_varags;

public class C04_VaragsIleUzunKelimeyiYazdirma {
    public static void main(String[] args) {
       enUzunKelimeyiYazdirma("ali","ayse","ismail","ahmet", "mihriban");
    }

    public static void enUzunKelimeyiYazdirma(String...kelime) {
        String enuzunKelime=kelime[0];

        for (String each :kelime
             ) {
            if(each.length()>enuzunKelime.length()){
                enuzunKelime=each;
            }
        }
        System.out.println("girilen kelimelerin en uzunu : "+enuzunKelime);
    }
}
