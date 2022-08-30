package day22_multiDimensionalArray;

public class calisma5 {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Karpim Tablosu");
        System.out.print("");
        for(i=1;i<=10;i++)
            System.out.printf("%4d",i);
        System.out.println();
        for(int k=1;k<11;k++){
            System.out.println("|");
            for(int l=1;l<11;l++)
                System.out.printf("%4d",k*l);
        }
        System.out.println("");
    }
}
