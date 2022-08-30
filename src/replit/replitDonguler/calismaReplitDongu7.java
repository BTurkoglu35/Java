package day16_forLoop;

public class calismaReplitDongu7 {
    // Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
    // Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
    //         Input :6
    // Output:6 Mukemmel Sayidir.
    // Input:7
    // Output:7 Mukemmel Sayidir degildir.

    public static void main(String[] args) {
       int input=28;
       int toplam=0;
        for (int i = 1; i <input ; i++) {
            if (input%i==0){
                toplam+=i;
            }

        }if (input == toplam) {
            System.out.println("mukemmel sayidir");

        }else System.out.println("mukemmel sayi degildir");

}





}
