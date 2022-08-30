package day24_arrsylist_foreachLoop;

public class Calisma02_Foreach {
    public static void main(String[] args) {

        //Dizi elemanlarının karakterlerinin toplamını bulmak için kodu yazın
        String[] str={"ali","fatman","mehmet","gamze"};
        int karakter=0;
        for (String each :str
             ) {
            karakter=karakter+each.length();
        }
        System.out.println(karakter);

















    }
}
