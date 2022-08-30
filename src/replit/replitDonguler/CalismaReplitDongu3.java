package day16_forLoop;


public class CalismaReplitDongu3 {
    public static void main(String[] args) {
        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //input :
        //String str=“Javaisalsoeasy”
        //Output: a s

        String str = "seerrttrr";
        String tekraEden = "";

        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            if (str.indexOf(c) != str.lastIndexOf(c)) {

                if (!tekraEden.contains(c)) {
                    tekraEden=tekraEden+c;
                }

            }
        }
        System.out.println(tekraEden);


    }
}














