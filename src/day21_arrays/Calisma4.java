package day21_arrays;

public class Calisma4 {
    public static void main(String[] args) {
      //  Dize 'n' veya 'k' ile bitiyorsa, bir String dizisindeki öğelerin baş harflerini alın
      //  Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

   String[] isimler={"Nevin","Tarik","mert","Leman"};
   String basHarf="";

        for (int i = 0; i <isimler.length; i++) {
            if(isimler[i].endsWith("n")||isimler[i].endsWith("k")){
                basHarf+=isimler[i].substring(0,1);
            }

        }
        System.out.println("basHarf = " + basHarf);



        }








    }

