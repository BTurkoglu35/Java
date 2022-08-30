package Practıce_01;

public class Q11_IfStaetmens {
    public static void main(String[] args) {
        /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */

        int not=60;
        if (not<=100 && not>=90){
        System.out.println("A");}
        else if (not<90 && not>=80){
            System.out.println("B");
        }else if (not<80 && not>=70){
            System.out.println("C");
        } else if (not < 70 && not >= 60) {
            System.out.println("D");
        } else if (not >= 0 &&  not <59){
            System.out.println("F");

        }else System.out.println("gecerli bir not giriniz");


    }
}
