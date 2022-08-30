package day24_arrsylist_foreachLoop;

public class Calisma01_Foreach {
    public static void main(String[] args) {
       // Belirli bir dizide belirli bir öğenin bulunup bulunmadığını bulmak için kodu yazın
        String[] str={"ali","fatman","mehmet","gamze"};
        String aranan="ziya";
        int count=0;

        for (String each :str
                ) {
            if (each.equalsIgnoreCase(aranan)){
                count++;
            }
        }if (count>0){
            System.out.println("aranan kelime var " );;
        }else System.out.println("aranan kelime yok");
















    }
}
