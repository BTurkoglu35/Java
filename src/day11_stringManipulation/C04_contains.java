package day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {
        /*Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa
         tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa
          tum cumleyi kucuk harf olarak yazdirin, iki kelimeyi de
          icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */
        //String cumle="Java buyuk, dunya ";

        //requirement de buyuk kucuk harf hassasiyeti hakkinda bir sey soylenmemis
        //ikinnci olarak da her iki kelimeyi de iceerne durumu aciklanmamis
        //bu durumd gorevi kim verdiyse ona sormak lazim.

        //ek requirements : ikisinide iceriyorsa "karar ver buyuk mu yazdirayim
        //kucuk mu? case sensitive olmasin
       /* if (cumle.contains("kucuk") && cumle.contains("buyuk")){
        System.out.println("karar ver buyuk mu kucuk mu");

    } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("cumle kucuk yada buyuk kelimesi iceriyor");
        }*/
        /*Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa
        tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa
        tum cumleyi kucuk harf olarak yazdirin, iki kelimeyi de
        icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
                */
        String str="Java buyuk,dunya ";
        if (str.contains("kucuk")&&str.contains("buyuk")){
            System.out.println("karar ver buyuk mu kucuk mu");
        } else if (str.contains("buyuk")) {
            System.out.println(str.toUpperCase());

        } else if (str.contains("kucuk")) {
            System.out.println(str.toLowerCase());
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }

    }
    }
