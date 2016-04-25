package com.example.project_mt23.topic_1_08.enums;

/**
 * Created by Initb on 25.04.2016.
 */
enum DayOfWeek {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;



    DayOfWeek getDayBeforeYesterday() {
        return values()[(values().length+(ordinal() - 2)) % values().length];
    }

    //the day after tomorrow
    DayOfWeek getDayAfterTomorrow() {
        return values()[(ordinal() + 2) % values().length];
    }
    @Override
    public String toString() {
        switch (this) {
            case Sunday:   return "Воскресенье";
            case Monday: return "Понедельник";
            case Tuesday: return "Вторник";
            case Wednesday: return "Среда";
            case Thursday: return "Четверг";
            case Friday: return "Пятница";
            case Saturday: return "Суббота";
        }
        return "Что-то невозможное!";
    }
}

public class DayOfWeekTest{
    static public void testDayOfWeek(StringBuffer out){
        DayOfWeek d = DayOfWeek.Monday;
        out.append("Сегодня ").append(d)
                .append("\nПозавчера ").append(d.getDayBeforeYesterday())
                .append("\nПослезавтра ").append(d.getDayAfterTomorrow())
                .append("\n");
    }
}
