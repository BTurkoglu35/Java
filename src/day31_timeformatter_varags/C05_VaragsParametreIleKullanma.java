package day31_timeformatter_varags;

public class C05_VaragsParametreIleKullanma {
    public static void main(String[] args) {


    enUzunKelimeyiYazdirma(5,"ali","ayse","ismail","ahmet", "mihriban");
/*
varargs teorik olarak sonsuz sayida element alabilir. Bir methodda parametre olarak
varargs varsa sinirlarini bilebillmesi icin parametrelerin sonuncusu olmalidir
oncesinde farkliparametreler olabilir ama varargs'dan sonra parametre olmaz

bu kuraldan oturun bir methodda bir tane varargs olabilir
 */
}

    public static void enUzunKelimeyiYazdirma(int kelimeSayisi,String...kelime) {
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

