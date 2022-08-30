package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0&& b<20 && c>=b);
        System.out.println(a<0 && b<20  && c>=b);
        //java && operatoru konusnda bize iki secenek sunar.
        //ilk false buldiginda diger sartlari kontrol etmez.
        // & kulaanirsak tum sartlari kontrol eder sonra sonucu bellirtir.
        //bundan dolayi & opertoru && operatorunden daha yavastir.

        System.out.println(a<0& b<20 & c>=b);


    }
}
