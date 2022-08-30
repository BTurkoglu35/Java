package day13_methodCreation;

public class C04_methodcreation {
    public static void main(String[] args) {
        //input olarak verileln iki intigeri toplayip sonucu yazdiran
        //bir method olusturun

        int input1 = 10;
        int input2 = 20;

        //method dort adimda olusturulur
        //1. adim method call
        //2. adim argument eklenmesi gerekiyorsa ekleyelim
        //eger methodun return type voidden farkli olacaksa
        //bir variable olusturup, method call'u assign edelim

        topla(input1, input2);


    }

    public static void topla(int input1, int input2) {
        //3. adim method deklerasyonunda degistirlmesi gereken bolumlri degistir
        //(accesss modofoer,return type vb)
        //4.eger return type void disinda birse ise
        //return keyword'u ve donecek sekilde degistirmeliyiz
        System.out.println("input1 ve input2 toplami   " + (input1+input2));
    }


}
