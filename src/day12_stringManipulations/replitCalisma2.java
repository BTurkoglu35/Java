package day12_stringManipulations;

public class replitCalisma2 {
    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);
        System.out.println("kenar uzunlugu giriniz");
        double kenar= scan.nextDouble();
        double alan=kenar*kenar;
        System.out.println("alan;"+alan);
        double cevre=kenar*4;
        System.out.println("cevre;"+cevre);*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kenar uzunluklarini giriniz. Enter tiklayark ilerleyiniz ");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        System.out.println("alan" + kenar1*kenar2);
        System.out.println("cevre" +((kenar1+kenar2)*2));*/

        /*Scanner scan =new Scanner(System.in);
        System.out.println(" günde kac bardak çay içtiğinizi yaziniz");
        double bardak=scan.nextDouble();
        System.out.println("1 bardakta ne kadar seker kulllandiginizi yaziniz");

        double seker=scan.nextDouble();
        double gunlukseker=bardak*seker*1.7;
        System.out.println("yillik seker tuketiminiz;"+gunlukseker*365/1000+"kg");*/

        // System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
      /* Scanner scan= new Scanner(System.in);
        System.out.println("float bir sayi degeri giriniz");
        float sayi=scan.nextFloat();
        short say= (short) sayi;
        System.out.println(say);*/
        ////  Scanner scan = new Scanner(System.in);
        //System.out.println("double bir sayi giriniz");
        //double say=scan.nextDouble();
        //int sayiint= (int) say;
        //System.out.println(sayiint);


        /*Kullanıcıdan üç basamaklı bir sayı girmesini ve
        bu sayının basamaklarının toplamını bulmasını isteyin.*/
        // Scanner scan = new Scanner(System.in);
        // System.out.println("uc basamakli bir sayi giriniz");
        // int say=scan.nextInt();
        // int birlerBas=0;
        // int rakamlarTop=0;

        // birlerBas=say%10;
        // rakamlarTop+=birlerBas;
        // say=say/10;

        // birlerBas=say%10;
        // rakamlarTop+=birlerBas;
        // say=say/10;

        // rakamlarTop+=say;
        // System.out.println(rakamlarTop);

     /*Girilen zamanı saniyeye çeviren bir program yazınız.

       ornek ;
        1 saat 10 dakika 50 saniye ==>

        4250 saniye*/
        //0  int saat=1;
        //0  int dakika=10;
        //0  int saniye=50;

        //0  saniye+=dakika*60;
        //0  saniye+=saat*60*60;
        //0 System.out.println(saniye);


        // Scanner scan = new Scanner(System.in);
        //  System.out.println("boyunuzu giriniz");
        //  double boy=scan.nextDouble();
        //  System.out.println("kilonuzu giriniz");
        //  double kilo=scan.nextDouble();
        //  double bmi=kilo/(boy*boy);
        //  System.out.println("bmi:"+bmi);
        //  if (bmi<18.5){
        //  System.out.println("zayifsiniz");}
        //  else if (bmi<25){
        //      System.out.println("kilonuz ideal");}
        //  else if (bmi<30){
        //      System.out.println("SSISMANSINIZ");}
        //  else{
        //  System.out.println("Obezsiniz");}

        /* Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String adi=scan.nextLine();
        System.out.println("soyadinizi giriniz");
        String soyadi=scan.nextLine();
        System.out.println("16 hanelik Kredi karti numaranizi giriniz");
        String iban=scan.nextLine();

        String ilkHarf=adi.substring(0,1).toUpperCase();
        String son=adi.substring(1).replaceAll("\\w", "*");

        String ilkHarfs=soyadi.substring(0,1).toUpperCase();
        String sonS=soyadi.substring(1).replaceAll("\\w", "*");

        String ibans=iban.substring(12,16);
        String ibani=iban.substring(0,12).replaceAll("\\w", "*");

        System.out.println(ilkHarf+son+"      " +ilkHarfs+sonS);
        System.out.println(ibani+ibans);*/

        /*char input='b';
        switch (input){
            case  'a':
                System.out.println("talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yinede ilgilendiginiz icin tesekkur ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");

            }*/

        //   Scanner scan = new Scanner(System.in);
        //   System.out.println("Lütfen  bir cumle yaziniz");
        //   String cumle=scan.nextLine();
        //   System.out.println("Lütfen bir harf giriniz");
        //   String harf=scan.next();
        //   System.out.println(cumle.contains(harf));


        //   Scanner scan = new Scanner(System.in);
        //     System.out.println("Lütfen  bir cumle yaziniz");
        //     String cumle=scan.nextLine();
        //    System.out.println("Lütfen bir kelime giriniz");
        //    String kelime=scan.nextLine();

        //    if  (cumle.indexOf(kelime)==-1){
        //        System.out.println("kelime cumlede kullanilmamis");
        //    } else if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)) {
        //        System.out.println("kelime cumlede bir kere kullanilmis");
        //    }else{
        //        System.out.println("kelime cumlede birden fazla kullanilmis");
        //    }


        // Scanner scan = new Scanner(System.in);
        //  System.out.println("Lütfen  bir cumle yaziniz");
        //  String cumle=scan.nextLine();
        //  System.out.println("Lütfen bir kelime giriniz");
        //  String kelime=scan.nextLine();
        // int kelimeilk=cumle.indexOf (kelime);
        // int kelimeiki =cumle.indexOf(kelime,kelimeilk+1);


        // if (kelimeilk==-1) {
        //     System.out.println("kelime cumlede kullanilmamis");
        // } else if (kelimeiki==-1) {
        //     System.out.println("kelime cumlede bir kere kullanilmis");
        // }else {
        //     System.out.println("kelime cumlede birden fazla kullanilmis");
        // }

        // Scanner scan = new Scanner(System.in);
        // System.out.println("lutfen email adresiinizi giriniz");
        // String email = scan.nextLine();

        // if (!email.contains("@gmail.com")) {
        //     System.out.println("lutfen email adresiinizi giriniz");

        // } else if (email.indexOf("@gmail.com") == (email.length() - 10)) {
        //     System.out.println("email adresiiniz kaydedildi");

        // }else {
        //     System.out.println("lutfen yazimi kontrol ediniz");
        // }


        // Scanner scan = new Scanner(System.in);
        // System.out.println("Lütfen  bir cumle yaziniz");
        // String cumle= scan.nextLine();

        // if (cumle.contains("buyuk")&&cumle.contains("kucuk")) {
        //     System.out.println("karar ver buyukmu kucuk mu");
        // } else if (cumle.contains("buyuk")) {
        //     System.out.println(cumle.toUpperCase());

        // } else if (cumle.contains("kucuk")) {
        //     System.out.println(cumle.toLowerCase());
        // }else {
        //     System.out.println("cumle buyuk yada kucuk harf icermiyor");
        // }

        // String  str="Java ogrenmek123  Cok guzel@";
        // System.out.println(str.replace("123", "").replace("Cok", "cok")
        //         .replace("@",""));

        //  String isim = "merve";
        //  if (!(isim.contains("a") && isim.contains("Z"))) {
        //      System.out.println("isim a veya Z harfi icermiyor");
        //  } else if (isim.contains("Z")) {
        //      System.out.println("isim Z harfi ceriyor");
        //  } else if (isim.contains("a")) {
        //      System.out.println("isim a harfi iceriyor");
        //  }

        //  Scanner scan= new Scanner(System.in);
        //  System.out.println("lutfen isminizi giriniz");
        //  String isim =scan.nextLine();
        //  System.out.println("lutfen soy isminizi giriniz");
        //  String soyisim =scan.nextLine();
//
        //  int isimLength=isim.length();
//
        //  int soyisimLength=soyisim.length();
//
//
        //  if (isimLength>soyisimLength) {
        //      System.out.println(isim);
        //  } else if (soyisimLength>isimLength){
        //      System.out.println(soyisim);
//
        //  } else if (isimLength==soyisimLength) {
        //      System.out.println(isim+"   " +soyisim);
//
        //  }

        //  String isim="dert";
        //  String isimTers= isim.substring(3)+
        //                    isim.substring(2,3)+
        //                    isim.substring(1,2)+
        //                    isim.substring(0,1);
        //  System.out.println(isimTers);



    }

}










