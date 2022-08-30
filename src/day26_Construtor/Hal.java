package day26_Construtor;

public class Hal {

     String isim="elma";
     String uretimYeri="amasya";
     int kasa;
     boolean dogalMi=false;
     String cins="kirmizi";

     public Hal() {
     }

     public Hal(String isim, String uretimYeri, int i, boolean b, String cins) {
          this.isim = isim;
          this.uretimYeri = uretimYeri;
          this.kasa=i;
          this.dogalMi=b;
          this.cins = cins;
     }

     public Hal(String isim, String uretimYeri, boolean b) {
          this.isim = isim;
          this.uretimYeri = uretimYeri;
          this.dogalMi= b;
     }


     @Override
     public String toString() {
          return
                  " \nisim= " + isim +
                  "\n uretimYeri= " + uretimYeri +
                  "\n kasa= " + kasa +
                  "\n dogalMi= " + dogalMi +
                  "\n cins= " + cins ;

     }
}
