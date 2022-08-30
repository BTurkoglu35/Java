package day11_stringManipulation;

public class C06_endsWith {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini
        // isteyin, mail @gmail.com icermiyorsa  "lutfen
        // gmail adresi giriniz", @gmail.com ile bitiyorsa
        // "Email adresiniz kaydedildi " , @gmail.com ile
        // bitmiyorsa lutfen yazimi kontol edin yazdirin

      /*  String input="fatih@gmail.com";
        if(!input.contains("gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (input.endsWith("gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }*/

        //Soru 1) Kullanicidan email adresini girmesini
        // isteyin, mail @gmail.com icermiyorsa  "lutfen
        // gmail adresi giriniz", @gmail.com ile bitiyorsa
        // "Email adresiniz kaydedildi " , @gmail.com ile
        // bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email ="busra@gmail";
        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmaail adresi giriniz");
        }
        else if (email.endsWith("@gmail.com")){
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin ");
        }






    }
}
