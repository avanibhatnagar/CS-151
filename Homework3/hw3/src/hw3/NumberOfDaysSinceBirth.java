package hw3;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
public class NumberOfDaysSinceBirth {

	public static long daysSinceBirth(int year, int month, int day, int hour, int min, int seconds, int nanosec, ZoneId zone) {
		ZonedDateTime dayOfBirth = ZonedDateTime.of(year, month, day, hour, min, seconds, nanosec, zone);
		long daysSinceBirth = dayOfBirth.until(ZonedDateTime.now(), ChronoUnit.DAYS);
		
		return daysSinceBirth;
	}
	
	public static void main(String[] args) {
		ZoneId indiaTimeZone = ZoneId.of("Asia/Kolkata");
		long numberOfDays = daysSinceBirth(1998,1,1,1,1,40, 5, indiaTimeZone);
		
		System.out.println("Number of days since I was born = " + numberOfDays);
	}
}
