package recap2;

public class Q02_SwitchCase {
    public static void main(String[] args) {
         /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String gun="pazar";

        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("java dersi");
                break;
            case"carsamba":
            case"cumartesi":
                System.out.println("SQL dersi ");
                break;
            case"persembe":
            case"cuma":
                System.out.println("selenyum dersi");
                break;
            default:
                System.out.println("izin gunu");
        }






















    }
}
