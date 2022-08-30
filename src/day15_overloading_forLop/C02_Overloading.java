package day15_overloading_forLop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*Javada olusturdugumuz metthodlrin isminin yaptigi islev ile uyumlu
        olmasini isteriz.Mesela bir stringin bir bolumunu almak icin
        2 adet substring() methodu kullaniriz
        verilen Strin=ng deki bazi parcalari yenileri ile degistirmek icin 2 adet replace()


        java ayni isimde birden fazla method varsa hangisinin kullanacagina parametre
        sayisi ve parametrelerin data turune gore karar verir
         */

        String str="Bu Java ogrenilecek baska yolu yok";
        str.substring(2);
        str.substring(2,4);


        str.replace('c','a');
        str.replace("j","H");

        /*ayni isimde amam farkli methodlari olusturmak icin degistirebielcgimiz seyler
        1) parametre sayisi
        2)aynu sayida parametreye sahip olsa bile parametrelerin data turleri
        3)ayni sayida ve ayni data turunde parametreleri olan methodlarda
        parametrelerin siralanisi
         */

    }
}
