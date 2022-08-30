package day22_multiDimensionalArray;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
   //verilem bir multi dimensional bir arrayin tum elemntelrini
   //yazdiran bir method olusturalim

        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);





    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i <sayilar.length; i++)  {//i=0,1,2
            for (int j = 0; j <sayilar[i].length; j++) {//inner arraylarin uzunluguna kadar
                System.out.print(sayilar[i][j]+" ");
            }

        }






    }

}
