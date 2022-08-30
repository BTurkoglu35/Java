package lmsSorular;

public class S03 {
    public static void main(String[] args) {
        //Bir tamsayıdaki benzersiz rakamları yazdırmak için kod yazın. Örnek; 223878 ⇒ 37

        Integer num= 223878;
        String  sayi=String.valueOf(num);

        String benzersiz="";


        for (Integer i = 0; i <sayi.length(); i++) {
            String c=sayi.substring(i,i+1);
            if(sayi.indexOf(c)==sayi.lastIndexOf(c)){
                benzersiz=benzersiz+sayi.substring(i,i+1);
            }
        }
        System.out.println(benzersiz);








    }
}
