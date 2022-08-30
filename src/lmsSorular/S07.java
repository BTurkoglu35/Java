package lmsSorular;

public class S07 {
    public static void main(String[] args) {
        /*
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
         */

        for (int i = 0; i <=4 ; i++) {
            String s="";


                if(i==0||i==4) {
                    for (int k = 0; k <8 ; k++) {
                        s+="A ";
                    }
                    System.out.println(s);

                }else{
                   s+="A ";
                for (int k = 0; k <6 ; k++) {
                    s+="X ";

                }
                 s+="A ";
                System.out.println(s);
            }}


            }

        }





