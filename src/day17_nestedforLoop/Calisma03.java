package day17_nestedforLoop;

public class Calisma03 {
    public static void main(String[] args) {


       // //uc basamakli sayilardan 15,20 ve 90 a tam bolunen sayilari yazdirin
//
//
       // for (int i = 100; i < 999; i++) {
//
       //     if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
       //         System.out.println("15, 20 ve 90 a tam bolunen sayilar" + i);
       //     }
//
       // }
//
        int sayilar =0;
        int baslangic=100;
        int bitis=999;

                while(baslangic<bitis){
                    if(baslangic%15==0 && baslangic%20==0 && baslangic%90==0){
                    System.out.println(baslangic);
                    }
                    baslangic++;

                }








    }
}





