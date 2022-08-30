package day24_arrsylist_foreachLoop;

import java.util.Arrays;

public class Calisma17_List {

    public static void main(String[] args) {


    String[] drinks = {"Coffee $2.10" , "Cappucino $4.5", "Latte $3.4", "Mocha $3.4", "Mocha $4.10", "Tea $2.50"};

    /*
     * Uptade the prices for these drinks raise by 10%
     *
     * Coffee $2.10 -> Coffee 2.31
     */
        for (int i = 0; i <drinks.length ; i++) {
            String para = drinks[i].substring(drinks[i].indexOf("$") + 1);
            double price = Double.parseDouble(para);

            double newPrice = price + price * 0.10;

            String newValue= drinks[i].substring(0, drinks[i].indexOf("$"))+newPrice;
            drinks[i]=newValue;

        }
        System.out.println(Arrays.toString(drinks));












        }















}
