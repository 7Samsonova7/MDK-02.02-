package zad4;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        // 1. Сравниваем год
        int yearComparison = Integer.compare(dt1.year, dt2.year);
        if (yearComparison != 0) {
            return yearComparison;
        }

        // 2. Если годы равны, сравниваем месяц
        int monthComparison = Integer.compare(dt1.month, dt2.month);
        if (monthComparison != 0) {
            return monthComparison;
        }

        // 3. Если месяцы равны, сравниваем день
        int dayComparison = Integer.compare(dt1.day, dt2.day);
        if (dayComparison != 0) {
            return dayComparison;
        }

        // 4. Если дни равны, сравниваем часы
        int hoursComparison = Integer.compare(dt1.hours, dt2.hours);
        if (hoursComparison != 0) {
            return hoursComparison;
        }

        // 5. Если часы равны, сравниваем минуты
        int minutesComparison = Integer.compare(dt1.minutes, dt2.minutes);
        if (minutesComparison != 0) {
            return minutesComparison;
        }

        // 6. Если минуты равны, сравниваем секунды
        return Integer.compare(dt1.seconds, dt2.seconds);
    }
}