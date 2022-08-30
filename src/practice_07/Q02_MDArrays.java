package practice_07;

import java.util.Arrays;

public class Q02_MDArrays {
    public static void main(String[] args) {


        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        double toplam=0;
        String[][]arr={{"$12" , "$22" , "0$"},
                {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j].contains("$")) {
                    toplam+=Double.parseDouble(arr[i][j].replaceAll("\\$",""))*3.2;

                }else {
                    toplam+=Double.parseDouble(arr[i][j].replaceAll("€",""))*4.2;
                }

            }

        }

        System.out.println("toplam = " + toplam);




















      // String[][] price = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
      // double toplam = 0;
      // for (int i = 0; i < price.length; i++) {
      //     for (int j = 0; j < price[i].length; j++) {
      //         if (price[i][j].contains("€")) {
      //             Double price1 = Double.valueOf(price[i][j].replaceAll("€", ""));
      //             toplam += price1 * 4.2;
      //         } else if (price[i][j].contains("$")) {
      //             Double price2 = Double.valueOf(price[i][j].replaceAll("\\$", ""));
      //             toplam += price2 * 3.2;
      //         }
      //     }
      // }
      // System.out.println("toplam = " + toplam);
    }}