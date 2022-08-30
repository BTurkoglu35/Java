package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak FileInputSstream Class'indan yardim aliriz.
        Ayni sekilde javadan bilgisayarimzdaki bir dosyaya ekleme  veya
        update yapmak istersek  FileOutputSstream Class'indan yardim aliriz.
         */
        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        goruldugu gibi compile time da altini kirmizi cizen her durum compile time error degildir.
        Java'da bazi exception'lar da compile time exception'dir
        ozellikle dosya okuma ve yazma ile ilgili exceptionlar compile time exception'dir.

        compile time exception olustugunda java cozum icin iki ihtimal onerir
        1-try-catch ile cevrelemek
        2- method signature'ina throws ketword ile beklenen exception turunu yazmak.

        throws exception , saddece olayin farkinda oldugumuzun declarasyonudur.
        exception'in handle edilmesinde hcbir rolu yoktur.
        Yani try catch ile kontrol altina aldigimiz exceptionlar da kod calismaya
        devam ediyordu
        ancak throws exception yazdigimzida java bir exception ile karsilasirsa hic
        bir sey yapmamisz gibi hata mesaji yayinlayip calismayi durdurur.
         */




    }

}
