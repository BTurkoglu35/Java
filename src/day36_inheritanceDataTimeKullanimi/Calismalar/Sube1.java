package day36_inheritanceDataTimeKullanimi.Calismalar;

public class Sube1 extends Merkez {
    protected String kabulEdenIsim="sube1 sorumlusu";

    protected int kutuAdet=40;

    protected String kargoKabulGunu="persembe";

    protected  void urunKontrol(){
        System.out.println("sube gorevlileri urunleri kontrol etti");
    }
    protected  void hataliUrun(){
        System.out.println("hatali urunler merkeze gonderildi");
    }
    public static void main(String[] args) {
   //    Sube1 teslimat1=new Sube1();
   //    System.out.println(teslimat1.kabulEdenIsim);//sube1 sorumlusu
   //    System.out.println(teslimat1.kutuAdet);//40
   //    System.out.println(teslimat1.kargokabulGunu);//persembe
   //    System.out.println(teslimat1.tur);//oyuncak
   //    System.out.println(teslimat1.turAdet);//0
   //    teslimat1.urunKontrol();//sube gorevlileri urunleri kontrol etti
   //    teslimat1.hataliUrun();//("hatali urunler merkeze gonderildi"
   //    teslimat1.urunSiniflandirma();//""urunler subeler gonderilmek uzere siniflandirildi"


   //    Merkez teslimat2=new Merkez();
   //        System.out.println(teslimat2.kabulEdenIsim);//isim belirtilmedi
   //        System.out.println(teslimat2.kutuAdet);//85
   //        System.out.println(teslimat2.kargoKabulGunu);//sali
   //        System.out.println(teslimat2.tur);//oyuncak
   //        System.out.println(teslimat2.turAdet);//0
   //        teslimat2.urunKontrol();//"urunler teslim alinirkem tek tek kontrol edildi");
   //        teslimat2.hataliUrun();//"hatali urunler depoya gonderildi
   //        teslimat2.urunSiniflandirma();//""urunler subeler gonderilmek uzere siniflandirildi"


     //   Depo teslimat3=new Depo();
    //    System.out.println(teslimat3.kabulEdenIsim);//isim belirtilmedi
    //    System.out.println(teslimat3.kutuAdet);//85
    //    System.out.println(teslimat3.kargoKabulGunu);//sali
    //    System.out.println(teslimat3.tur);//oyuncak
     //   System.out.println(teslimat3.turAdet);//0
    //    teslimat3.urunKontrol();//"urunler kargodan once kontrol edildi"edildi");
    //    teslimat3.hataliUrun();//"hatali urunler depoya gonderildi
     //   teslimat3.urunSiniflandirma();//urunler turlerine paketlend


   Merkez teslimat4=new Sube1();
      System.out.println(teslimat4.kabulEdenIsim);//isim belirtilmedi
      System.out.println(teslimat4.kutuAdet);//85
      System.out.println(teslimat4.kargoKabulGunu);//sali
      System.out.println(teslimat4.tur);//oyuncak
      System.out.println(teslimat4.turAdet);//0
      teslimat4.urunKontrol();//sube gorevlileri urunleri kontrol etti;
      teslimat4.hataliUrun();//hatali urunler merkeze gonderildi
      teslimat4.urunSiniflandirma();//"urunler subeler gonderilmek uzere siniflandirildi


   //  Depo teslimat5=new Sube1();
   //   System.out.println(teslimat5.kabulEdenIsim);//isim belirtilmedi
   //  System.out.println(teslimat5.kutuAdet);//85
   // System.out.println(teslimat5.kargoKabulGunu);//sali
   //    System.out.println(teslimat5.tur);//oyuncak
   //    System.out.println(teslimat5.turAdet);//0
   //    teslimat5.urunKontrol();//sube gorevlileri urunleri kontrol etti;
   //    //teslimat5.hataliUrun();//hatali urunler merkeze gonderildi
   //    teslimat5.urunSiniflandirma();//"urunler subeler gonderilmek uzere siniflandirildi
   //    System.out.println(teslimat5.kargoGunu);//pazartesi










    }




}
