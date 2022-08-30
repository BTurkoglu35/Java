package day04_vaiables;

public class CalismaOdev {
    public static void main(String[] args) {

        byte say1= 55;
        short say2= say1;
        System.out.println(say1+say2);
        int say3=say2+10;
        System.out.println(say3);
        float say4= say3+say2+say1;
        System.out.println(say4);
        double say5=say4+26.7;
        System.out.println(say5);

        byte say11=50;
        int say10=750;
        byte say12=(byte)(say10+say11);
        System.out.println(say12);

        short say13= 1556;
        float say14=123587;
        short say15= (short) (say13+say14);
        System.out.println(say15);

        double sayx=255.36;
        int sayy= (int) sayx;
        byte sayc= (byte) sayy;
        System.out.println(sayx+"       "+sayy+

                "     " +
                ""+sayc);

        int say01=354;
        int say02=45;
        int bolm=(say01/say02);
        System.out.println(bolm);

        int say03=65;
        double say04=658.21;
        System.out.println(say03/say04);



        int a1=152;
        byte b2=65;
        System.out.println(a1+b2);

        double a3=458.65;
        System.out.println(b2+a3);

       double a5=a1+b2;
        System.out.println(a5);

        byte a6= (byte) (a3+a1);
        System.out.println(a6);




        int numA=65;
        numA+=12;
        System.out.println(numA);
        numA*=2;
        System.out.println(numA);
        numA++;
        System.out.println(numA);














    }
}
