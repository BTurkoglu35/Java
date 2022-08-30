package day17_nestedforLoop;

public class C02_NestedForLoop {
    //verilen sayiya gore carpim tablosu olusturun
    public static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.print((i*j)+" " );

            }
            System.out.println("");
        }
    }
}
