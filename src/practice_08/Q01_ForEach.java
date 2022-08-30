package practice_08;

public class Q01_ForEach {

    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18};
        int ciftTop = 0;
        int tekTop = 0;
        for (int each : arr){

            if (each % 2 == 1) {
                System.out.print("tek"+each+" ");;
                System.out.println();
            } else if (each%2==0) {
                System.out.print("cift"+each+" ");


            }
        }


}

     // for (int each:arr) {
     //     if (each%2==0){
     //         ciftTop+=each;

     //     }else if (each%2==1){
     //         tekTop+=each;
     //     }
     // }
     // System.out.println("tekTop = " + tekTop);
     // System.out.println("ciftTop = " + ciftTop);
    }



