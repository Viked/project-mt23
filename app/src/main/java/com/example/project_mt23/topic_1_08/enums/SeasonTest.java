package com.example.project_mt23.topic_1_08.enums;

/**
 * Created by Initb on 25.04.2016.
 */

enum Season{
    WINTER, SPRING, SUMMER, AUTUMN;

    Season next() {
        return values()[(ordinal() + 1) % values().length];
    }

    Season previous() {
        return values()[(values().length + (ordinal() - 1)) % values().length];
    }


    @Override
    public String toString() {
        switch (this) {
            case WINTER: return "Зима";
            case SPRING: return "Весна";
            case SUMMER: return "Лето";
            case AUTUMN: return "Осень";
        }
        return "Невозможно";
    }
}

public class SeasonTest {
    static public void testSeason(StringBuffer out){
        Season season = Season.WINTER;
        out.append("Сейчас ").append(season)
                .append("\nПредыдущий ").append(season.previous())
                .append("\nСледующий ").append(season.next())
                .append("\n");
    }
}
