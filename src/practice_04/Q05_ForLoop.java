package practice_04;

public class Q05_ForLoop {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

     //   for (int i = 0; i <=255; i++) {
//
     //       char d= (char) i;// casting yaptik, sayi harf ve karakter
     //       System.out.println(i + "-> "+d);
     //   }

       int i=0;
      // while (i <= 255){
      //     char sembol=(char) i;
      //     System.out.println(i + "-> "+sembol);
      //     i++;
      // }

        do {
            char sembol=(char) i;
            System.out.println(i + "-> "+sembol);
            i++;

        }while (i <= 255);





    }
}
