package day11_stringManipulation;

public class Calisma1 {
    public static void main(String[] args) {

        /*String str="busra 54";
        String isim= "mustafa ";
        System.out.println(isim.toUpperCase().charAt(3));
        System.out.println(isim. concat(str));

        System.out.println(isim.length());
        System.out.println(isim.charAt(str.length()-1));*/

       /* String str ="Asudeyi cok severim";
        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        if(ikincie==-1){
            System.out.println("ikinci e yok");
        } else  {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("ucuncue yok");;
            }else
            {
                System.out.println("ucuncu e nin indexi:"  + ucuncue);
            }*/
         //indexOf soru1
       /* Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen bir harf yaziniz");
        char harf=scan.nextLine().charAt(0);
        int harf1=cumle.indexOf( harf );
        if (harf1==-1){
        System.out.println("cumllede   " +harf +"  harfi  yok");

        }else{
            System.out.println("cumllede  " +harf +"  harfi var");
        }*/
        //indexOf soru2
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen bir kelime yaziniz");
        String kelime =scan.next();
        int kelime1=cumle.indexOf(kelime);

        if (kelime1==-1){
            System.out.println("kelime cumlede kullanilmamis");
        } else{
            int kelime2=cumle.indexOf(kelime, kelime1+1);
            if (kelime2==-1){
                System.out.println("kelime cumlede bir kere kullanilmis");
            }else {
                System.out.println("kelime cumlede birde fazla kullanilmis");
            }
        }*/

        int a=3;
        int b=5;
        System.out.println("a="+a +" b="+b);

        int tplm=a+b;
        a=tplm-a;

        b=tplm-b;
        System.out.println("a="+a +" b="+b);

    }


    }

