package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalismaSlaytSoru3 {
    public static <list> void main(String[] args) {
        //kullanici Q ya basana kadar kullanicidan isimleri alarak bir lise olusturup bu simleri bize list
        //olarak donduren bir method olusturun
        String isim="";
      List<String>isimler=listOlusturma(isim);
        System.out.println(isimler);


    }

    public static List<String> listOlusturma(String isim) {
        List<String> isimler=new ArrayList<String>();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("isim giriniz");
            isim = scanner.nextLine();
            if(!isim.equals("Q")){
            isimler.add(isim);}
        } while (!isim.equals("Q"));







    return isimler;
    }
}
