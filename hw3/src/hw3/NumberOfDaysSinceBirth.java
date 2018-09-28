package hw3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;


public class NumberOfDaysSinceBirth {
    /**
     * Calculates the days since a person's birth
     */
    public static long daysSinceBorn(int year, int month, int day, int hour, int minute, int second, int nanoSecond, ZoneId zone)
    {
        ZonedDateTime dayBorn = ZonedDateTime.of(year,month,day,hour,minute,second,nanoSecond,zone);
        long daysSinceBirth = dayBorn.until(ZonedDateTime.now(), ChronoUnit.DAYS);

        return daysSinceBirth;
    }

    public static void main(String[] args){

        ZoneId indiaTimeZone = ZoneId.of("Asia/Kolkata");
        long daysSinceBorn = daysSinceBorn(1998,1,1,12,15,7,60,indiaTimeZone);

        System.out.println(daysSinceBorn);

    }
}