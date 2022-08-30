package day11_stringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
        /*String str = "Java ogrenmek cok guzel";
        /*verilen bir stringde herhangi bir string veya
         charinilk kulaanildigi indexi bize dondurur
         */
      /*  System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf('r'));//7
        System.out.println(str.indexOf('J'));//0

        System.out.println(str.indexOf("mek"));//10
        //eger istediginiz indexten sonrasini kontrol etmek istersek
        //o zaman ayni methodu iki parametreli oarak kullanmaliyiz

        System.out.println(str.indexOf("g", (6 + 1)));//yazilan indexten baslar

        //yukaridaaki satirda 2. ve3. e nin indexlerini bulun
        //2. e yi bulmak icin 1. e niin  indexine ihtiyacim var

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);
        //eger ikinci e varsa 3. e nin olup olmadigini
        //ve varsa indexini yazdiralim

        if (ikincie == -1) {
            System.out.println("verilen str da 2. e yok");
        } else {
            int ucuncue = str.indexOf("e", ikincie + 1);
            if (ucuncue == -1) {
                System.out.println("verilen str da 3. e yok");
            } else {
                System.out.println("verilen str daki  3. e nin idexi :  " + ucuncue);
            }  */


            String cumle = "aisude le hayat muhtesem";
            int ilka = cumle.indexOf("a");
            int ikincia = cumle.indexOf("a", ilka + 1);
            int ucuncua = cumle.indexOf("a", ikincia + 1);
            if (ilka == -1) {
                System.out.println("verilen cumlede a harfi yok");
            } else if (ikincia == -1) {
                System.out.println("verilen cumlede ikinci a harfi yok");
            } else if (ucuncua == -1) {
                System.out.println("verilen cumlede ucumcu a harfi yok");
                ;
            } else {
                int dorduncua = cumle.indexOf("a", ucuncua + 1);
                if (dorduncua == -1) {
                    System.out.println("verilen cumlede udorduncu a harfi yok");
                } else {
                    System.out.println("verilen cumlede udorduncu a harfinin indexi" + dorduncua);
                }
            }
        }
    }