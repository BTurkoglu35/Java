package day17_nestedforLoop;

public class Calisma01 {
    public static void main(String[] args) {
        //20 ve 50 dahil aralarindaki cift tam sayilari yazdiralim

        for (int i = 20; i <=50 ; i++) {
            if(i%2==0){
                System.out.print(i +"  ");
            }

        } System.out.println();
        int bas=20;
        int bitis=50;
        while (bas<=bitis){
            if(bas%2==0){
                System.out.print(bas + " ");

            }bas++;

        }System.out.println();
        int ilk =50;
        int son=20;
        while (ilk>=son){
            System.out.print(ilk + " ");
            ilk--;
        }







    }
}
