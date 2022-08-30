package day30_inmutable;

import java.time.LocalDate;
import java.time.Month;

public class DateCalisma {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();//bulundugu gunun tarihini verir
        System.out.println(tarih);

        System.out.println(tarih.getDayOfYear());//bulundugu gunun yil icinde kacinci gun oldugunu doner
        System.out.println(tarih.getDayOfWeek());//Haftanin hangi gunu oldugunu doner
        System.out.println(tarih.getMonthValue());//hangi ay oldugunu bize dondurur
        System.out.println(tarih.isLeapYear());//artik  yil olup olmadigini bize boolean dondurur

        LocalDate tarih2 = LocalDate.of(2012, 7, 30);
        System.out.println(tarih2);

        LocalDate tarih3 = LocalDate.of(2010, Month.FEBRUARY, 15);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));//100 gun sonra tarih ne olur
        System.out.println(tarih.plusYears(4).plusMonths(6).plusDays(15));

        System.out.println(tarih.minusWeeks(15));//15 hafta once tarih neydi
        System.out.println(tarih.minusDays(100));//100gun once tarih neydi

        System.out.println(tarih2.isAfter(tarih3));//tarih2 tarih 3 ten sonra mi
        System.out.println(tarih3.isBefore(tarih));//tarih3 tarih ten once mi true

    }
}