package day12_stringManipulations;

public class replitScanner {
    public static void main(String[] args) {
        // soru 1
        //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını
        // ve çevresini konsola yazdıran bir program yazın.
        //Ornek Cikti :
        //Alan: 9
        //Cevre: 12

        /* Scanner scan = new Scanner(System.in);
        System.out.println("kenar uzunlugu giriniz");
        double kenar= scan.nextDouble();
        double alan=kenar*kenar;
        System.out.println("alan;"+alan);
        double cevre=kenar*4;
        System.out.println("cevre;"+cevre);*/


        //soru 2
        //Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve
        //çevresini konsola yazdıran bir program yazın.
        // Örnek Çıktı:
        //Alan: 32
        //Çevre: 24
        /*Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kenar uzunluklarini giriniz. Enter tiklayark ilerleyiniz ");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        System.out.println("alan" + kenar1*kenar2);
        System.out.println("cevre" +((kenar1+kenar2)*2));*/


        //soru 3
        //Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        //1 şeker = 1.7 gr
        //Örnek Çıktı:
        //Yılda 12.41 kg şeker kullanıyor.

        /*Scanner scan =new Scanner(System.in);
        System.out.println(" günde kac bardak çay içtiğinizi yaziniz");
        double bardak=scan.nextDouble();
        System.out.println("1 bardakta ne kadar seker kulllandiginizi yaziniz");

        double seker=scan.nextDouble();
        double gunlukseker=bardak*seker*1.7;
        System.out.println("yillik seker tuketiminiz;"+gunlukseker*365/1000+"kg");*/

        //soru 4
        // kullanicidan float vee double turunden iki sayi alalilm.
        //floati short data turune ve double int sayi turune cevirelim

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

        // soru 5
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



        //soru 6
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


        //soru 7
        /*  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

          BMI = kilo(kg) /(boy*boy)(cm)
          BMI <=20 oldukca zayifsiniz
          20<BMI<=25 Normal sinirlardasiniz
          25<BMI<=30 Sisman kategorisindesiniz
          30<BMI ==> Obez grubundasiniz.
          * */
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


        //soru 8
        //kullanicidan isim soyisim ve iban bilglerini alin
        // isin ilk harfini buyuk geri kalan kismini * seklinde yazdiralim
        //soyismin ilk harfini buyuk geri kalan kismini * seklinde yadiralim
        //ibanin ilk 12 hanesisini * geri kalanini rakam seklinda yazdiralim


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


        // soru 9
        // kullanicidan char input alalim
        //input 'a' ise "talebiniz isleniyor"
        //input 'b' ise "yinede ilgilendiginiz icin tesekkur ederiz"
        //input 'c' ise "Üzgünüz, şu anda herhangi bir yardım yok"
        //bunlardan biri degil ise "Geçersiz giriş, lütfen tekrar deneyin!" yaziniz
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


         // soru 10
        // kullanicidan bir cumle ve bir harf girmesini isteyin
        // cumlenin girilen harfi icerip icermedigini kontri=ol edelim


        //   Scanner scan = new Scanner(System.in);
        //   System.out.println("Lütfen  bir cumle yaziniz");
        //   String cumle=scan.nextLine();
        //   System.out.println("Lütfen bir harf giriniz");
        //   String harf=scan.next();
        //   System.out.println(cumle.contains(harf));




        //soru 12
        // kullanicidan bir cumle ve kelime girmesini isteyiin
        //kelimenin cumlede kullanilma durumuna bakin
        //hic kullanilmamsissa "kelime cumlede kullanilmamis")
        // bir kere kullanilmmisa "kelime cumlede bir kere kullanilmis"
        //birden fazla kullanilmisa "kelime cumlede birden fazla kullanilmis"


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


        //soru 13
        //kullnaicidan email adresi girmesini isteyin
        //girilen adres @gmail icermiyorsa "lutfen email adresiinizi giriniz"
        // girilen adres @gmail.com ile bitiyorsa "email adresiiniz kaydedildi"
        //bitmiyorsa "lutfen yazimi kontrol ediniz"


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

        //soru 14
        //kullanicidan cumle isteyin
        //cumle buuyuk vekucuk kelimesini iceriyorsa "karar ver buyukmu kucuk mu")
        //sadece buyuk kelimesini iceriyorsa cumleyi buyuk harfle yazdirin
        //sadecekucuk kelimesini iceriyorsa cumleyi kucuk harfle
        // ikisinide icermiyorsa "cumle buyuk yada kucuk harf icermiyor" yazdirin


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


        //soru15
        //isim a ve Z harfi icermiyorsa "isim a veya Z harfi icermiyor"
        //isim Z harfi iceriyorsa "isim Z harfi ceriyor"
        //isim a harfi iceriyorsa "isim a harfi iceriyor" yazdirin
        //  String isim = "merve";
        //  if (!(isim.contains("a") && isim.contains("Z"))) {
        //      System.out.println("isim a veya Z harfi icermiyor");
        //  } else if (isim.contains("Z")) {
        //      System.out.println("isim Z harfi ceriyor");
        //  } else if (isim.contains("a")) {
        //      System.out.println("isim a harfi iceriyor");
        //  }


        //soru16
        //kullancidan isim soyisim alin
        //isimin uzunlugu buyukse isimi, soyismin uzunlugu uzunsa soyismi
        //isim ve soyisim esitse ikisini yazdiRIN
        //  Scanner scan= new Scanner(System.in);
        //  System.out.println("lutfen isminizi giriniz");
        //  String isim =scan.nextLine();
        //  System.out.println("lutfen soy isminizi giriniz");
        //  String soyisim =scan.nextLine();

        //  int isimLength=isim.length();

        //  int soyisimLength=soyisim.length();
        //  if (isimLength>soyisimLength) {
        //      System.out.println(isim);
        //  } else if (soyisimLength>isimLength){
        //      System.out.println(soyisim);
        //  } else if (isimLength==soyisimLength) {
        //      System.out.println(isim+"   " +soyisim);

        //soru 17
        //String ismi tersten yazdiralim
        //  String isim="dert";
        //  String isimTers= isim.substring(3)+
        //                    isim.substring(2,3)+
        //                    isim.substring(1,2)+
        //                    isim.substring(0,1);
        //  System.out.println(isimTers);





    //soru20
    /*
    Kullanıcıyı dan yas bilgisini alarak
	    oy kullanma yasi :
	 	yaş >= 18 ==> oy uygun uygun
	 	yaş >= 70 ==> uc kez oy kullanabilir
	 	70 > yaş >=50 ==> iki kez oy kullanabilir
	 	50 > yaş >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

        //Scanner scan = new Scanner(System.in);
        //System.out.println("lutfen yasinizi giriniz:");
        //double yas=scan.nextDouble();
        //if (yas>=18) {
        //    System.out.println("oy uygun");
        //    if (yas >= 18 && yas < 50) {
        //        System.out.println("birkez oy kullanabilir");
        //    } else if (yas >= 50 && yas < 70) {
        //        System.out.println("iki kez oy kullanabilir");
        //    } else System.out.println("uc kez oy kullanabilir");
        //}else System.out.println("oy kullanamaz");



    // soru21
/*
    Final notu tanimlayin, Nested Üçlü ile cozunuz
    'A' -> "Gayet Başarılı"
    'B' -> "Başarılı"
    'C' -> "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
        //char finall='B';
        //System.out.println(finall=='A'?"Gayet Başarılı":finall=='B'?"Başarılı":finall=='C'?"Ha gayret":"digerleri");

    //soru22
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersleri
    silah Perşembe veya Cuma ise:
    Selenyum ders gunleri
    gun çarşamba veya cumartesi ise:
    SQL dersleri
    halde: izin günü aksi
    (eğer deyimini KULLANMAYIN)
*/

        //String gun="pazar";

        //switch (gun) {
        //    case "pazartesi":
        //        System.out.println("java dersi");
        //        break;
        //    case "sali":
        //        System.out.println("java dersi");
        //        break;
        //     case "carsamba":
        //        System.out.println("SQL dersi");
        //        break;
        //     case "persembe":
        //        System.out.println("selenyum dersi");
        //        break;
        //    case "cuma":
        //        System.out.println("selenyum dersi");
        //        break;
        //    case "cumartesi":
        //        System.out.println("SQl dersi");
        //        break;
        //    default:
        //        System.out.println("izin gunu");

        //soru23
       /*
		 * Kullanicidan ilk 3 büyük harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * örnek
		 * Kullanıcı : A , B , C harflerinden biri secsin
			 A'yi secmis ise, ==> Java kolaydir
			 B'yi secmis ise, ==> Java eğlencelidir
			 C'yi secmis ise, ==> ders çalışmam lazım :)
		 */

   //    char tercih='A';
   //
   //
   //    switch (tercih){
   //        case 'A':
   //            System.out.println("java kolaydir");
   //        case 'B':
   //            System.out.println("java eglencelidir");
   //        case 'C':
   //            System.out.println("ders calismam lazim :)");
   //
       //soru24
        //Kullanıcıdan ismini ve soyisimi kullanmayı isteyin, sonrasında konsola tam adı büyük harf ile yazdirin

     // Scanner scan = new Scanner(System.in);
     //   System.out.println("lutfen isminizi giriniz");
     //   String isim = scan.nextLine().toUpperCase();
     //   System.out.println("lutfen soyisminizi giriniz");
     //   String soyisim=scan.nextLine().toUpperCase();
     //   System.out.println(isim.concat("    ").concat(soyisim));

         // soru 25
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    //  Scanner scan = new Scanner(System.in);
    //  System.out.println("lutfen isminizi giriniz");
    //   String isim = scan.nextLine().toUpperCase();
    //   System.out.println("lutfen soyisminizi giriniz");
    //   String soyisim=scan.nextLine().toUpperCase();
    //   System.out.println(isim.concat("    ").concat(soyisim));

    //   isim=isim.substring(1);
    //  soyisim=soyisim.substring(1);
    //  System.out.println(isim.concat(soyisim));


    //sor26
        /*
         * Kulanicidan bir kelime istemek eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. değil ise girilen kelimeyi yazdirin
         *
         * örnek
         * girdi = Ali
         * çıktı = lilili
         *
         * girdi = el
         * çıktı = el
         */
  // Scanner scan = new Scanner(System.in);
  // System.out.println("kelime giriniz");
  // String kelime=scan.nextLine();
  // int uzunluk=kelime.length();
  // System.out.println(uzunluk);
  // String sonIki=kelime.substring(kelime.length()-2);
  // if (uzunluk>2){
  //     System.out.println(sonIki.concat(sonIki).concat(sonIki));}
  // else {
  //     System.out.println(kelime); }













    }



















    }











































