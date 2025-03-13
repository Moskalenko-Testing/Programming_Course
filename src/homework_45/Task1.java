package homework_45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Текущая дата : " + localDate);

        System.out.println("Текущий год : " + localDate.getYear() + "; Текущий месяц : " + localDate.getMonth() + "; Текущий день : " + localDate.getDayOfMonth());

        LocalDate localDate1 = LocalDate.of(1999, 3, 15);
        System.out.println("Мой день рождения : " + localDate1);

        LocalDate localDate2 = LocalDate.of(1999, 3, 15);
        System.out.println("Равны ли даты : " + localDate1.equals(localDate2));

        LocalTime localTime = LocalTime.now();
        System.out.println("Текущее время" + localTime);

        System.out.println("Текущее время + 3 часа" + localTime.plusHours(3));

        LocalDate localDate3 = LocalDate.now().plusWeeks(1);
        System.out.println("Которая на неделю позже сегодняшней : " + localDate3);

        LocalDate localDate4 = LocalDate.now().minus(1, ChronoUnit.YEARS);
        System.out.println("Которая была на год раньше сегодняшней : " + localDate4);

        LocalDate localDate5 = LocalDate.now().plus(1, ChronoUnit.YEARS);
        System.out.println("Которая на год позже сегодняшней : " + localDate5);

        LocalDate localDate6 = LocalDate.now().plusDays(1);
        LocalDate localDate7 = LocalDate.now().minusDays(1);
        System.out.println("tomorrow : " + localDate6 + "; yesterday : " + localDate7);
    }
}
