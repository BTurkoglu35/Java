package day21_arrays;

public class Calisma9 {
    public static void main(String[] args) {

     //   Belirli bir dizide belirli bir öğenin bulunup bulunmadığını bulmak için kodu yazın

        String[] dize={"kalem","defter","bardak","Asude","Su"};
        String aranan ="Asu";

        int counter=0;
        for (int i = 0; i <dize.length; i++)  {
            if (dize[i].equalsIgnoreCase(aranan)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("kelime dizede bulunuyor");
        }else System.out.println("kelime dizede bulunmuyor");

















    }
}
