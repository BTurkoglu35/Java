package day22_multiDimensionalArray;

public class Calisma2 {
    public static void main(String[] args) {
     //   Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
     //   yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

       int[][] arr={ {1,2,3}, {4,5,6} };
       int tumElemanlarinCarpimi=1;
        for (int i = 0; i <arr.length; i++)  {
            for (int j = 0; j <arr[i].length; j++)  {
                tumElemanlarinCarpimi*=arr[i][j];
            }
        }  System.out.println(tumElemanlarinCarpimi);



    //2
        // Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        //ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
           int[][] sayilar=  { {1,2,3}, {4,5}, {6} };
           int sonElemanlarinCarpimi=1;


        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length; j++)  {
                if(j==sayilar[i].length-1){
                    sonElemanlarinCarpimi*=sayilar[i][j];
                }

            }

        }
        System.out.println(sonElemanlarinCarpimi);


















    }
}
