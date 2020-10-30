package ls1029_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        //LocalDate, LocalTime, LocalDateTime - new API
        //ZonedDateTime zonedDateTime = new ZonedDateTime();

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate localDate = date.minusWeeks(5);
        System.out.println(localDate);

        LocalDate minus = date.minus(10, ChronoUnit.DAYS);//-10 days
//date.minusDays(10);

        LocalDate parse = LocalDate.parse("22-10-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(parse);

        String dateString = parse.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.GERMAN));
        System.out.println(dateString);

        ChronoUnit.DAYS.between(minus,LocalDate.now());

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId: availableZoneIds){
            //System.out.println(zoneId);
        }

        LocalDateTime indien = LocalDateTime.now(ZoneId.of("Indian/Kerguelen"));
        System.out.println(indien);
    }

}
