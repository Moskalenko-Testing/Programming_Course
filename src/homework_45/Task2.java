package homework_45;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/*
Написать метод, принимающий список из нескольких дат
типа LocalDate и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */
public class Task2 {
    public static long getDaysBetweenMinMax (List<LocalDate> dates) {
        LocalDate minDate = dates.stream()
                .min(LocalDate::compareTo).orElseThrow();
        LocalDate maxDate = dates.stream()
                .max(LocalDate::compareTo).orElseThrow();

        return ChronoUnit.DAYS.between(minDate, maxDate);


    }

    public static void main(String[] args) {
        List<LocalDate> dateList = List.of(
                LocalDate.of(2025, 5, 10),
                LocalDate.of(2025, 5, 15),
                LocalDate.of(2025, 5, 20)
        );

        System.out.println("Количество дней между самой ранней и поздней датой: " + getDaysBetweenMinMax(dateList));
    }
}
