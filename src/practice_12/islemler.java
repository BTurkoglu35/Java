package practice_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class islemler {

    static List<Kisi> ogtmnList = new ArrayList<Kisi>();
    static List<Kisi> ogrnciList = new ArrayList<Kisi>();
    static Scanner scan = new Scanner(System.in);
    //static yazmamizin sebebi tum methodlardan ulasmak icin,,gokteki ay gibi
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");
        System.out.println("lutfen islem yapmak istediginiz kisi turunu girinizn\n ogretmen veya ogrenci");
        String secim = scan.next().toUpperCase();//kullanici kucuk harf girse bile buyuk harfe cevirdik cunku kontrol buyuk harf.
        switch (secim) {
            case "OGRENCI":
                kisiTuru = "ogrenci";
                islemMenusu();
                break;

            case "OGRETMEN":

                kisiTuru = "ogretmen";
                islemMenusu();
                break;
            case "Q":

                break;
            default:
                System.out.println("hatali giris");
                girisPaneli();
                break;

        }

    }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu "+kisiTuru+" lutfen asagidki islemleri seciniz");
        System.out.println(" ============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ" );
        System.out.println("islem tercihinizi giriniz: ");
        int  secilenIslem=scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
              girisPaneli();
                break;
            case 0:
                break;

            default:
                System.out.println("dogru birsey gir");
                islemMenusu();
                break;


        }

}

    private static void silme() {
        System.out.println("*** "+kisiTuru+" silme sayfasina hosgeldiniz");
        boolean flag=true;



        if(kisiTuru.equalsIgnoreCase("OGRETMEN")){
            scan.nextLine();
            System.out.println("silmek istediginiz kisinin tc numarasini giriniz");
            String silinecekKimlikNo=scan.nextLine();
            for (Kisi each:ogtmnList
                 ) {
                if(each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("silinen ogretmen "+each.getIsimSoyisim());
                    ogtmnList.remove(each);
                    flag=false;
                    break;
                }
            }if(flag){
                System.out.println("ogretmen yok silinemedi");
            }
        }else {
            scan.nextLine();
            System.out.println("silmek istediginiz kisinin tc numarasini giriniz");
            String silinecekKimlikNo=scan.nextLine();
            for (Kisi each:ogrnciList
            ) {
                if(each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("silinen ogrenci "+each.getIsimSoyisim());
                    ogrnciList.remove(each);
                    flag=false;
                    break;
                }
            }if(flag){
                System.out.println("ogrenci yok silinemedi");
            }


            }
        }



    private static void listeleme() {
        System.out.println("*** "+kisiTuru+" arama sayfasina hosgeldiniz");
        if(kisiTuru.equalsIgnoreCase("OGRETMEN")){
            for (Kisi w:ogtmnList
                 ) {
                System.out.print("w tostring \n " +w.toString()+"\n");
            }
        }else if(kisiTuru.equalsIgnoreCase("OGRENCI")){
            for (int i = 0; i<ogrnciList.size() ; i++) {
                System.out.print(ogrnciList.get(i));
                System.out.println();

            }
        }


    }

    private static void arama() {
        System.out.println("*** "+kisiTuru+" arama sayfasina hosgeldiniz");

        System.out.println("arama yapmak icin kimlik no giriniz");
       scan.nextLine();
        String arananKimlikNo=scan.nextLine();

        if(kisiTuru.equalsIgnoreCase("OGRETMEN")){
            for (int i = 0; i <ogtmnList.size() ; i++) {
                if(arananKimlikNo.equals(ogtmnList.get(i).getKimlikNo())){
                    System.out.println("aradiginiz ogretmen : "+ogtmnList.get(i).getIsimSoyisim());
                }else System.out.println("kimlik no ile kayitli ogretmen mevcut degil");
            }

        } else if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            for (int i = 0; i < ogrnciList.size(); i++) {
                if (arananKimlikNo.equals(ogrnciList.get(i).getKimlikNo())) {
                    System.out.println("aradiginiz ogrenci : "+ogrnciList.get(i).getIsimSoyisim());
                } else System.out.println("kimlik no ile kayitli ogrenci mevcut degil");

            }

        }

    }

    private static void ekle() {//bu method hem ogrenci hemde ogretmen eklemek icin tasarlandi


        System.out.println("****"+kisiTuru+"ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim gir");
        String isimSoyisim=scan.nextLine();
        scan.nextLine();
        System.out.println("kimlik no gir");
        String kimlikNo=scan.next();
        scan.nextLine();
        System.out.println("yas gir");
        int yas=scan.nextInt();


        if(kisiTuru.equalsIgnoreCase("ogrenci")){
            scan.nextLine();
            System.out.println("ogrenci no gir");
            String ogrenciNo=scan.next();
            scan.nextLine();
            System.out.println("sinif bilgisi gir");
            String sinif=scan.next();
            Ogrenci ogrenci = new Ogrenci(isimSoyisim,kimlikNo,yas,ogrenciNo,sinif);
            ogrnciList.add(ogrenci);

        }else{
            scan.nextLine();
            System.out.println("bolum gir");
            String bolum=scan.nextLine();
            scan.nextLine();
            System.out.println("Sicil no giriniz");
            String sicilNo=scan.next();

            Ogretmen ogretmen = new Ogretmen(isimSoyisim,kimlikNo,yas,bolum,sicilNo);
            ogtmnList.add(ogretmen);

        }




    }
}