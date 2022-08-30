package lmsSorular;

public class S08 {
    public static void main(String[] args) {
        /*
        Bir String'de 'm' harfinin ilk geçtiği yerden önceki tüm karakterleri yazın
         */

        String str="kuzu asus kum ile oyun oynadi";
        int mIndex=str.indexOf("m");
        String mOncesi="";
        for (int i =0; i <mIndex ; i++) {
           mOncesi+=str.substring(i,i+1);

        }
        System.out.println(mOncesi);





    }
}
