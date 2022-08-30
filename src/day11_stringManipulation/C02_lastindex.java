package day11_stringManipulation;

public class C02_lastindex {
    public static void main(String[] args) {

        /* String cumle= "Java cok kolay, Java cok guzel";
        String kelime="Java";
        //verilen kelime icin asagidaki sartlardan uygun olani yazan bir
        //program yaziniz
        //-verilen kelime cumlede sadece 1kere kullanilmis
        //-verilen kelime cumlede birden fazla kullanilmis
        int kelimeIlkIndex= cumle.indexOf(kelime);
        int kelimeSonIndex= cumle.lastIndexOf(kelime);
        if(kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("kelime cumlede sadece 1 kere kullanilmis");

        }else {
            System.out.println("kelime cumlede 1den fazla kullanilmis");

        } */


        // alistirma
        String str="Asude cok guler, Asude cok aglar";
        String kelime ="cok";
        int kelimeIlkIndex=str.indexOf(kelime);//6
        int kelimeSonIndex=str.lastIndexOf(kelime);//23

        if (kelimeIlkIndex==-1){
            System.out.println("kelime cumlede kullanilmamis");
        }else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("kelime cumlede bir kere kullanilmis");
        }else{
            System.out.println("kelime cumlede birden fazla kullanilmis");
        }


    }
}
