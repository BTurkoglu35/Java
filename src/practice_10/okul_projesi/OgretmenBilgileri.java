package practice_10.okul_projesi;

public class OgretmenBilgileri {

String isim;
String soyisim;
int yas;
String brans;
String tel;

    @Override
    public String toString() {
        return
                "\n isim=  " + isim +
                "\n soyisim=  " + soyisim +
                "\n yas=  " + yas +
                "\n brans=  " + brans +
                "\n tel=  " + tel ;

    }

    public OgretmenBilgileri(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;




    }
}
