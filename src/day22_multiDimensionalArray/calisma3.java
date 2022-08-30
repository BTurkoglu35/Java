package day22_multiDimensionalArray;

public class calisma3 {
    public static void main(String[] args) {
     //   Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
     //   elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arr1 = { {1,2},
     //           {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int[][] arr= { {1,2,3},{3,4,}, {6,3} };
        int[][] arr2= { {7,8,9}, {10}, {12,2} };

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    for (int l = 0; l < arr2[k].length; l++) {
                      if(i==k&&j==l){
                          toplam+=arr2[k][l]+arr[i][j];
                      }
                    }

                }
            }

        }
        System.out.println(toplam);



























    }
}
