package day15_overloading_forLop;

public class C06_StringTersCevirme {
    public static void main(String[] args) {
        //input olarak verilin sitringi terse cevirip yazdiran bir metod olusturun
        String input="Java gun gectikce guzellesiyor";
        tterstenYazdir(input);

    }

    public static void tterstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }

    }

