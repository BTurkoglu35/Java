package day23_arrayList;

public class CalismaSlaytSoru1 {
    public static void main(String[] args) {
        //verilen array'de tekrar eden elementleriri yazdiralim

        String[] array = {"a", "r", "c", "b", "a", "e", "r"};
        String tekrarEden = "";
        String karakterler = "";
        for (int i = 0; i < array.length; i++) {
            if (!karakterler.contains(array[i])) {
                karakterler += array[i];
            } else tekrarEden += array[i];
        }
        System.out.println(tekrarEden);





























    }


}

