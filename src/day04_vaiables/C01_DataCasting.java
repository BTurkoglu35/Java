package day04_vaiables;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';          //char yeniharf=harf+1  yanlis ifade.
        char yeniharf=(char) (harf+1); //kod bu durumfa once sagdaki islemi yapar
                              //char yeniHarf=97+1---->98
                              //char bir variable 98 olamayacagi icin java hata verir.
        System.out.println(yeniharf);

        char harf2=99;
        System.out.println(harf2);
        /*bazen bir  variable`a olusturuldugu dsts turu disindan degeratanabilir
        Bunlardan bazisini java otamatik olarak  kabul eder.
        jaava eger bu deger atamasinda sorun olusacagini ( data kayio=plarinin olabilecegi veya datanin
        baskalasabilecgi) gorurse bu durumda otomatik olarak bu atamayi kabul etmez.
        */
        int say1=(int)7.3;
        double say2=10;
        System.out.println("say2"+say2);
        int say3='c';
        System.out.println("say3:"+say3);
        char say4=98;
        System.out.println("say4:"+say4);
    }
}
