package day18_while_doWhileLoop;

public class Calisma9 {
    public static void main(String[] args) {
        //bir for dongsusu olusturarak asagidaki sekli cizelim
//
   //     A
   //     A A
   //     A A A
   //     A A A A
        int bas=1;
        int son=4;

        while (bas<=son) {
            for (int i = 1; i <=bas ; i++) {
                System.out.print("A" +" ");
            } System.out.println();
            bas++;
        }


        System.out.println();
        int bass=1;
        int sonn=4;
        do {
            for (int i = 1; i <=bass ; i++) {
                System.out.print("A" +" ");
        } System.out.println();
            bass++;

        }while (bass<=sonn);






    }
}
