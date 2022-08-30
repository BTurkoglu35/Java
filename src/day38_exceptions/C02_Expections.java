package day38_exceptions;

public class C02_Expections {
    public static void main(String[] args) {

        int a = 1000;
        int b = 50;
        int sayac=1;
        while (sayac<100){
            /*
            try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri
            yazmak icin kullanilir

            catch'den sonraki parentez karsilasmayi bekledigimiz exception turunu
            javaya soylemek icin kullanilir

            catch blogu ;javaya syledigimiz exception(istisnai durum)  gerceklesince
            javanin yapmasini istedigimimz islem

            catch blogunun onundeki paranteze karsilasmayi bekledgimiz exception'i yazabilir veya
            her turlu exception'da devreye girmesini istiyorsak tum exceptionlarin parenti olan
            exception yazazabilirz.
             */

            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda 0 oldu,dikkatli ol");
            }
            b--;
            sayac++;
        }
    }
}
