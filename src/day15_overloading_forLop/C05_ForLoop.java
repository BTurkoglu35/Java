package day15_overloading_forLop;

public class C05_ForLoop {

    public static void main(String[] args){

        //1den 5e kadar(5dahil) olan tam sayilari toplayalim
        int toplam=0;
        for ( int i=1; i<=5; i++ ) {
            toplam+=i;



        }


        System.out.println("toplam = " + toplam);
        //10 dahil 20 dahil aradaki sayilari tioplayiniz...
        toplam=0;
        for ( int i=10; i<=20; i++) {
toplam+=i;
        } System.out.println("toplam = " + toplam);

        //30 dahil 50 dahil aradaki cift sayilari tioplayiniz...
        toplam=0;
        for ( int i=30; i<=50; i+=2) {
         toplam+=i;
        }
        System.out.println("30 dahil 50 dahil aradaki cift sayilari tioplami = " + toplam);
        //2.yontem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam);
        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin
        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("1500-1600 arasi yedi ile bolunebilen sayilarin toplam : " + toplam);
    }
    }

