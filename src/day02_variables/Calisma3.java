package day02_variables;

public class Calisma3 {
    public static void main(String[] args) {

        int sayı1 = 65;
        int number2 = 78;
        System.out.println("swaptan önce number1:" + sayı1 + "number2:" + number2);

        int temp=sayı1;

        sayı1= number2;

        number2=temp;
        System.out.println("swaptan sonra number1:" + sayı1 + "number2:" + number2);

        int say1=25;
        int say2=47;
        System.out.println("koddan önce say1:" +say1+"say2:" +say2);

        say1=say2;
        say2=25;
        System.out.println("koddan sonra say1:" +say1+"say2:" +say2);
    }
    }