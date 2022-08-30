package day17_nestedforLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        //verilen inputa gore sekli olusturalim
        /*
         * *
         * * *
         * * * *
         * * *
         * *
         *
         */ //artan kismi nesteed for loop ile yapalim
        int input = 4;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = input - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }


}












