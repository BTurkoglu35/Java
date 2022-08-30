package Practice_11;

public class Q05 {
    public static void main(String[] args) {
        int[]arr={17,23,33,9,20};
        System.out.println(arrTopla(arr));
        varagslaToplaList(25,55,63,21,20);
        System.out.println(varagslaTopla(arr));


    }

    private static int varagslaTopla(int...i) {
        int toplam=0;
        for (int w:i
        ) {
            toplam+=w;

        }

        return toplam;
    }

    private static void varagslaToplaList(int i, int i1, int i2, int i3, int i4) {



    }

    private static int arrTopla(int[] arr) {
        int toplam=0;
        for (int w:arr
             ) {
            toplam+=w;

        }

       return toplam;
        }

    }


