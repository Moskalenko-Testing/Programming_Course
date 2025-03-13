package lesson_45;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTime {
    public static void main(String[] args) {

        //LocalDate - представляет дату(год, месяц, день) без времени к часовом поясу

        LocalDate date = LocalDate.now();// возвращает текущую дату
        System.out.println("now : " + date);

        //Прибавить один день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow : " + tomorrow);
        System.out.println("plusweeks : " + date.plusWeeks(4));// плюс 4 неделе к дате
        System.out.println("yesterday : " + date.minusDays(1));// минус один день

        LocalDate date1 = LocalDate.of(2020, 2, 15);// создать дату с указанным годом, месяцем и днем
        System.out.println("date1 : " + date1);

        // Можно использовать Enum с использованием месяцев
        date1 = LocalDate.of(2002, Month.FEBRUARY,15);
        System.out.println("date1 : " + date1);


        System.out.println("год : " + date1.getYear() + "; месяц-Enum : " + date1.getMonth() + "; месяц-число : " + date1.getMonthValue());
        System.out.println("число : " + date1.getDayOfMonth() + "; день недели : " + date1.getDayOfWeek() + "; день в году : " + date1.getDayOfYear());
        System.out.println("дней в месяце : " + date1.lengthOfMonth() + "; дней в году : " + date1.lengthOfYear() + "; isLeap: " + date1.isLeapYear());

        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println("date2 : " + date2);

        System.out.println("========LocalTime==========\n");

        //LocalTime - представляет время (часы, минуты, секунды, наносекунды) без даты
        LocalTime time = LocalTime.now();// возвращает текущее время
        System.out.println("now : " + time);

        time = LocalTime.of(21, 33);// создать время с указанными часами, минутами, секундами и наносекундами

        System.out.println("time : " + time);

        System.out.println("time.plusHours : " + time.plusHours(1));//возращает новый объект LocalTime с +1 час к старому объекту
        System.out.println("time.plusMinutes : " + time.plusMinutes(65));//возращает новый объект LocalTime с +65 минут к старому объекту
        System.out.println("time.minusSeconds : " + time.minusSeconds(30));

        System.out.println(time.getHour() + " : " + time.getMinute() + " : " + time.getSecond() + " : " + time.getNano());
        String timeStr = "12:33:45";
        LocalTime time2 = LocalTime.parse(timeStr);
        System.out.println("time2 : " + time2);

        System.out.println("========LocalDateTime==========\n");

        //LocalDateTime - представляет дату (год, месяц, день) и время (часы, минуты, секунды, наносекунды)
        LocalDateTime dateTime = LocalDateTime.now();// возвращает текущую дату и время
        System.out.println("now : " + dateTime);

        LocalDate localDate = LocalDate.of(2011,Month.AUGUST,15);
        LocalTime localTime = LocalTime.of(15, 33, 59);

        LocalDateTime dateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime : " + dateTime2);
        dateTime2 = LocalDateTime.of(2025,12,31,23,59);
        System.out.println(dateTime2.getDayOfWeek());

        // Доступны все методы LocalDate и LocalTime
        System.out.println("dateTime2.plusHours : " + dateTime2.plusHours(1));
        System.out.println("dateTime2.minusYears : " + dateTime2.minusYears(1));

        String strDT = "2011-08-15T15:33:59.999";
        LocalDateTime parseDT = LocalDateTime.parse(strDT);
        System.out.println("dateTime3 : " + parseDT);

        System.out.println("=====================ZonedDateTime===================\n");
        //ZonedDateTime - представляет дату (год, месяц, день) и время (часы, минуты, секунды, наносекунды) с часовой зоной
        ZonedDateTime zonedDateTime = ZonedDateTime.now();// возвращает текущую дату и время с часовой зоной
        System.out.println("now : " + zonedDateTime);
        System.out.println(zonedDateTime.getZone());


        System.out.println("=====================isAfter, isBefore , until, equals===================\n");

        //isAfter - возвращает true, если текущая дата больше заданной
        LocalDate date3 = LocalDate.of(2020,10,15);
        LocalDate date4 = LocalDate.of(2020,6,25);
        boolean isAfter = date3.isAfter(date4);
        System.out.println("isAfter : " + isAfter);


        //isBefore - возвращает true, если текущая дата меньше заданной
        System.out.println("date3.isBefore(date4)" + date3.isBefore(date4));


        //equals - возвращает true, если текущая дата равна заданной дате
        System.out.println("date3.equals(date4)" + date3.equals(date4));

        //until - возвращает период между текущей датой и заданной датой
        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("date3.until(date4, ChronoUnit.DAYS)" + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime4 = LocalDateTime.now().minusDays(15);
        //until - возвращает период между текущей датой и заданной датой
        System.out.println(dateTime1.until(dateTime4, ChronoUnit.SECONDS));


        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.DAYS);
        System.out.println(dateTime3);
        LocalDateTime dateTime3_1 = dateTime1.minus(10, ChronoUnit.HOURS);
        System.out.println(dateTime3_1);
        System.out.println(dateTime1.plus(5, ChronoUnit.YEARS));

        System.out.println("\n============ Duration, Period, Instant");

        // Классы Duration, Period оба представляют собой отрезки времени.
        // Но используются для разных типов временных сущностей.
        // Duration - продолжительность времени (часы, минуты, секунды)
        // Period - для долгосрочных отрезков времени: дни, месяцы, годы

        LocalTime start = LocalTime.of(10, 30);
        LocalTime end = LocalTime.of(12, 45);

        // Разница между временами
        Duration duration = Duration.between(start, end);
        System.out.println("duration: " + duration);
        long milis = duration.toMillis();
        System.out.println("milis: " + milis);
        long second = duration.toSeconds();
        System.out.println("second: " + second);
        System.out.println(duration.getSeconds());

        /*
        toDays(), toHours(), toMinutes(), toMillis(), toNanos() -
        возвращает продолжительность в соответствующих единицах измерения
         */

        // Instant - представляет собой точку на временной шкале в Григорианском календаре
        // сколько прошло миллисекунд с 1 января 1970 UTC
        Instant instant = Instant.now();
        System.out.println("instant: " + instant.getEpochSecond());

        System.out.println("\n ============== DateTimeFormatter ===========");
        // DateTimeFormatter форматирование и парсинг даты и времени.
        // Позволяет создавать форматированные строки из дат/времени. А также обратно парсить строки в объекты дат / времени


        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        String formattedDate = now.format(formatter);

        System.out.println("formattedDate: " + formattedDate);

        /*
        y - год
        M - месяц
        d - день
        H - час в формате 0 до 23
        h - час в формате 0 до 12, a - для отображения AM/PM
        m - минута
        s - секунда
        остальные символы в шаблоне - отображаются "как есть"

        Количество повторений символа определяет формат отображения unit
        yy - двухзначный год, например 25 для 2025
        yyyy - 4-значный год
        M - месяц без ведущего нуля: "2" или "12"
        MM - всегда двухзначный месяц: "02" или "12"
        d - день без ведущего нуля: "3" или "29"
        dd - двухзначный день: "03" или "29"
         */

        String dateForParse = "2023-10-26 19:15";
        System.out.println("stringWithDate: " + dateForParse);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parseLDT = LocalDateTime.parse(dateForParse, formatter1);

        System.out.println(parseLDT.getDayOfWeek() + " | " + parseLDT.getHour());

        /*
        15-12-2022 20-46
        Запарсить строку в формат LocalDateTime.
        Распечатать отдельно месяц, день, час объекта LDT

        13-01-2023 00-47
        Какому дн недели соответствует вторая дата
        Сколько дней между этими двумя датами
         */











    }
}
