package day16_forLoop;

public class Calisma8 {
    public static void main(String[] args) {
       //yildizlar ile ucgen olusturma
        for (int i = 1; i <=10 ; i++) {
            for (int j = i; j <=10 ; j++){
                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println();
        }


        //tersten yildiz yazdirma

        for (int i =1; i <=10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((" "));

            }for (int k =10;k>=i; k--) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println();

        }






























    }
}
