package practice_07;

public class Q01_MDArrays {
    public static void main(String[] args) {


        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int arr[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min=arr[0][0];
        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j]<min){
                    min=arr[i][j];
                }

            }

        }
        System.out.println("min = " + min);















        // int[][] sayilar = {{9, 8, 3}, {6, 3, 7}, {5, 5, 5}, {4, 5, 3}};
      // int min = sayilar[0][0];

      // for (int i = 0; i <sayilar.length ; i++) {
      //     for (int j = 0; j <sayilar[i].length ; j++) {
      //         if (sayilar[i][j] < min) {
      //             min = sayilar[i][j];
      //         }
      //     }
      // }  System.out.println("min sayi= " + min);








    }
}