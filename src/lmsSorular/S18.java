package lmsSorular;

public class S18 {
    public static void main(String[] args) {
        /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç kelime içerir. Kod yazmak için
kelimelerin kendilerini korurken, her girdi satırındaki kelimelerin sırasını tersine çevirir. Bu
Çıktınızın satırlarında sonda veya başta boşluk olmamalıdır.
Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüştürülecektir
Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç kelime içerir. Kod yazmak için
         */


        String str="asude can kuzu";
    String[] arr=str.split(" ");
    String ters="";
        for (int i =arr.length - 1; i >= 0; i--) {
            ters+=arr[i]+" ";

        }
        System.out.println(ters);










    }
}
