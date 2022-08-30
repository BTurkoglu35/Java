package day12_stringManipulations;

import java.util.Scanner;

public class replitStringMethods {
    public static void main(String[] args) {
        //soru1/ methods 8
        //Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        //INPUT : Mustafa
        //OUTPUT : fafafa

        // Scanner scan=new Scanner(System.in);
        // System.out.println("lutfen bir isim giriniz");
        // String isim= scan.nextLine();
        // int uzunluk=isim.length();
        // System.out.println(uzunluk);
        // String sonIkiHarf=isim.substring(isim.length()-2);
        // if(uzunluk>1){
        //     System.out.println(sonIkiHarf+sonIkiHarf+sonIkiHarf);
        // }else System.out.println("gecerli bir isim giriniz");

        //soru2/methods 7
        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor

        //  String isim1 = "hacihoca";
        //  String isim2 = "hakki";
        //  int uzunlukIsimBir = isim1.length();
        //  System.out.println(uzunlukIsimBir);
        //  int uzunlukIsimiki = isim2.length();
        //  System.out.println(uzunlukIsimiki);
        //  String isim1Son = isim1.substring(isim1.length() / 2);
        //  String isim1Ilk = isim1.substring(0, isim1.length() / 2);

        //  if (uzunlukIsimBir %2 == 0) {
        //      System.out.println(isim1Ilk.concat(isim2).concat(isim1Son));
        //  } else System.out.println("isim1 isim2 ye eklenmiyor");


        //soru 3/ method6
        //Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //Eger aynı karakterlere sahipse
        //"isim ayni karakterlere sahiptir." yazdirin.
        //Eger ayni kaakterlere sahip degilse
        //dizenin benzersiz karakterleri var" yazdirin.
        //Ternary kullanin.


        //soru 4/ method5
      /*  Bir aydaki gün sayısını bulan bir Java programı yazınız. editöre git

        Test Verileri
        Ay sayısı giriniz: 2
        Yılda giriniz: 2016
        Beklenen Çıktı :
        Şubat 2016'da 29 gün vardır*/

        //ner scan= new Scanner(System.in);
        //tem.out.println("lutfen ayi giriniz");
        //ing ay= scan.next();
        //tem.out.println("lutfen yil giriniz");
        // yil= scan.nextInt();
        // gun = 0;

        //switch (ay) {
        // case "ocak":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "subat":
        //     if (yil % 400 == 0 || yil % 4 == 0 && yil % 100 != 0) {
        //         System.out.println("gun ssayisi 29");
        //     } else System.out.println("gun ssayisi 28");
        //     break;
        // case "mart":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "nisan":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "mayis":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "haziran":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "temmuz":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "agustos":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "eylul":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "ekim":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "kasim":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // case "aralik":
        //     System.out.println("gun ssayisi 31");
        //     break;
        // default:
        //     System.out.println("gecerli bir ay ismi giriniz");


        //soru 5/ method4
        //   Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
        //   yanıt a ise, "Talebiniz işleniyor" mesajı yazdırılır
        //   yanıt b ise, "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
        //   yanıt c ise, "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
        //   başka herhangi bir yanıt değeri için, "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır

        //   char yanit='g';
        //   switch (yanit){
        //       case 'a':
        //           System.out.println("Talebiniz işleniyor");
        //           break;
        //       case 'b':
        //           System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
        //           break;
        //       case 'c':
        //           System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
        //           break;
        //       default:
        //           System.out.println("Geçersiz giriş, lütfen tekrar deneyin!" );


        //soru6 /method 3
        //  Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        //  Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        //  Ornek:
        //  INPUT :
        //  25
        //  46
        //  OUTPUT :
        //  Numaralarin Toplami:71

    int sayi1 =555555;
    int sayi2 = 1455555125;
    int toplam = sayi1 + sayi2;
    if (sayi1 >= 0 && sayi2 >= 0) {
        if (toplam > 999999999) {
            System.out.println("OverFlow");
        } else
            System.out.println("toplam = " + toplam);
    } else System.out.println("gecerli bir sayi giriniz");









        //soru7/method2
     //   Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
     //           Input :John White
     //   1234234534561478
     //   Output:
     //   Name:
     //   J ***W ****
     //   CCN: **** **** ****1478
     //   Ilk Harfler Buyuk harf ile baslamalidir.

  //     Scanner scan=new Scanner(System.in);
  //     System.out.println("adiniz:");
  //     String isim=scan.nextLine();
  //     System.out.println("soyadiniz:");
  //     String soyadiniz=scan.nextLine();
  //     System.out.println("kredi karti numaraniz:");
  //     String kknumarasi=scan.nextLine();
  //     String isimilk=isim.substring(0,1).toUpperCase();
  //     String isimSon=isim.substring(1).replaceAll("\\w","*");
  //     String soyadIlk=soyadiniz.substring(0,1).toUpperCase();
  //     String soyadSon=soyadiniz.substring(1).replaceAll("\\w","*");
  //     String ibanSon=kknumarasi.substring(12,16);
  //     String ibanIlk=kknumarasi.substring(0,12).replaceAll("\\d","*");
  //     System.out.println(isimilk+isimSon+"  "+soyadIlk+soyadSon);
  //     System.out.println(ibanIlk+ibanSon);






        //soru8 /method1
    //   Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
    //           IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
    //   BMI 18,5'in altındaysa zayıfsınız
    //   BMI 18,5 ile 25 arasında ise kilonuz idealdir
    //   BMI 25-30 arasındaysa şişmansınız
    //   BMI 30'dan büyük veya eşitse, obez
    //   Input:
    //   Output:
    //   Agirlik : 71
    //   Boy : 1,72
    //   BMI : 23.99945916711736
    //   Zayifsiniz.















    }
}
