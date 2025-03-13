package homework_45;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
15-12-2022 20-46
Запарсить строку в формат LocalDateTime.
Распечатать отдельно месяц, день, час объекта LDT

13-01-2023 00-47
Какому дню недели соответствует вторая дата?
Сколько дней между этими двумя датами?


 */
public class Task3 {
    public static void main(String[] args) {
        String dateForParse = "15-12-2022 20-46";
        System.out.println("stringWithDate: " + dateForParse);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseLDT = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println("Месяц = " + parseLDT.getMonth().getValue() + " ;" + " день = " + parseLDT.getDayOfMonth() + " ;" + " час = " + parseLDT.getHour());

        String dateForParse2 = "13-01-2023 00-47";
        System.out.println("stringWithDate: " + dateForParse2);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseLDT2 = LocalDateTime.parse(dateForParse2, formatter2);
        System.out.println("День недели = " + parseLDT2.getDayOfWeek());

        long daysBetween = ChronoUnit.DAYS.between(parseLDT, parseLDT2);
        System.out.println("daysBetween = " + daysBetween);

    }
}
