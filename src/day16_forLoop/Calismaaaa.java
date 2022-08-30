package day16_forLoop;

public class Calismaaaa {
    public static void main(String[] args) {

        String isim = "JavaisalsoeaseyyJ";
        int isimLength = isim.length();
        for (int i = 0; i <= isimLength - 1; i++) {
            for (int j = i + 1; j <= isimLength - 1; j++) {
                char ilkIsim = isim.charAt(i);
                if (ilkIsim == isim.charAt(j) && ilkIsim != ' ') {
                    isim = isim.replace(Character.toString(ilkIsim), "0");
                    if (ilkIsim != '0') {
                        System.out.print(ilkIsim + " ");
                    }
                }
            }
        }
    }
}