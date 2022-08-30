package day30_inmutable;

import java.time.LocalTime;

public class LocalTimeCalisma {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);
        Thread.sleep(3000);
        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond());//dakikayi getirir
        System.out.println(time1.plusSeconds(1000));//saniye sonra
        System.out.println(time1.minusSeconds(1000));//dakika sonra

        System.out.println(time1.withHour(3));








    }









}
