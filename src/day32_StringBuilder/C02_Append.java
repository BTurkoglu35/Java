package day32_StringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java daha ne yapsin");

        sb.append("?");
        System.out.println(sb);//java daha ne yapsin?

        //append istedigimiz stringi en sona ekler

        sb.insert(5,"her seyi dusunmus ");
        System.out.println(sb);

        //araya ekleme yspmak istediginzde append degil insert methodu kullanilir

         sb.insert(22,"valla valla",5,11);
        System.out.println(sb);




    }
}
