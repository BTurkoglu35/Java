package day31_timeformatter_varags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");

        System.out.println(dtf.format(tarihSaat));//25/7/22 09:45

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");

        System.out.println(dtf1.format(tarihSaat));//25/Jul/2022 21:48




    }
}
