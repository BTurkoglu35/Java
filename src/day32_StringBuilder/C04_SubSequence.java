package day32_StringBuilder;

public class C04_SubSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kayra");

        sb.substring(0,3);
        // bu method String dondurdugu icin string builderin eski halinin degistirmez
        System.out.println(sb.substring(0,3)) ;
        ;
        sb.subSequence(0,3);
        System.out.println(sb);//kayra

        System.out.println(sb.subSequence(0,3));

    }
}
