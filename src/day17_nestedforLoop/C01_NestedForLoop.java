package day17_nestedforLoop;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        //verilen stringdeki kullanilan harfleri tekrarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini veren bir method yapin


        String input = "taka tuka";

        tekrarsızYap(input);

    }

    public static void tekrarsızYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W",""); // EmsalEfe
        System.out.print(islenecekKelime.substring(0,1)); // E
        benzersizInput+=islenecekKelime.substring(0,1); // E

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }

        }
        System.out.println("");
        System.out.println("girdi: " + input);
        System.out.println("benzersiz input : " +benzersizInput);

    }

    public static class C07_NestedForLoop {


















    }
}