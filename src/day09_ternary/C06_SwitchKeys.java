package day09_ternary;

public class C06_SwitchKeys {
    public static void main(String[] args) {
/*kullanicidan gun ismunu alin.hafta ici veya hafta sonu oldugunu yazdirin.*/


        String input= "pazar";
        switch (input){
            case"pazartesi":
                System.out.println("Hafta ici");
                break;
                case"sali":
                System.out.println("Hafta ici");
                break;
                case"carsamba":
                System.out.println("Hafta ici");
                break;
                case"persembe":
                System.out.println("Hafta ici");
                break;
                case"cuma":
                System.out.println("Hafta ici");
                break;
                case"cumartesi":
                System.out.println("Hafta sonu");
                break;
                case"pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("lutfen gecerli bir gun giriniz");





        }}
}
