package day16_forLoop;

public class C01_Forloop {
    public static void main(String[] args) {

        // int input = 120;
        // for (int i = 1; i <= input; i++) {
        //     if (input % i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }


        // verilen bir pozitif tam sayinin
        // tam bolenlerini yazdiralim

        int tamSayi = 50;
        for (int i = 1; i <= tamSayi; i++) {
            if (tamSayi % i == 0) {
                System.out.println(i + " ");

            }


        }


    }
}