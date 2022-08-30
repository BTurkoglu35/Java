package day04_vaiables;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=50;

        short sayi2= (short) sayi1;
        System.out.println(sayi2);
        /* genis data turundeki degeri dar daata turundeki avariabla
        atamak isterseniz jaava sizin genis data turundeki degerin , dar data
        turunun sinirlarina uyup uymayacagini calistirana kadar bilemez
        java risk almaz. riski sifira indirmekicin sorumlulugu kabul etmenix=zi bekler
        bunun icin degerin onune parantez icinde istenilen data  turu yazilir */

    }
}
