package pl.sdacademy.podstawy.time;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime newYearsEve = LocalDateTime.of(
            2020, 12, 31, 23, 59, 30
        );

        System.out.println(newYearsEve);

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);

        newYearsEve = LocalDateTime.parse("2020-12-31T23:59:30");
        System.out.println(newYearsEve);

        System.out.println(currentTime.isAfter(newYearsEve));

        LocalDateTime newYear = newYearsEve.plusDays(1);
        System.out.println("Niezmieniona: " + newYearsEve);
        System.out.println("Nowa wartość: " + newYear);

        System.out.println(LocalDateTime.MIN);
        System.out.println(LocalDateTime.MAX);
    }
}
