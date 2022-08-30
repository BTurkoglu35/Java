package day17_nestedforLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20 den 50 ye kadar(sinirlar dahil) cift sayilari yazdiralim
        int bas=20;
        int bitis=50;



        int temp=bas;
        while (temp<=50) {
            if (temp % 2 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }

    }
}
