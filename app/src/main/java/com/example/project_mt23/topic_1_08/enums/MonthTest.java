package com.example.project_mt23.topic_1_08.enums;

/**
 * Created by Initb on 25.04.2016.
 */
enum Month{
    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    September(30),
    October(31),
    November(30),
    December(31);

    private int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    Month next() {
        return values()[(ordinal() + 1) % values().length];
    }

    Month previous() {
        return values()[(ordinal() - 1) % values().length];
    }
    
    public Season getSeason(){
        switch (this){
            case December:
            case January:
            case February:
                return Season.WINTER;
            case March:
            case April:
            case May:
                return Season.SPRING;
            case June:
            case July:
            case August:
                return Season.SUMMER;
            case September:
            case October:
            case November:
            default:
                return Season.AUTUMN;
        }
    }

    @Override
    public String toString() {
        String out;
        switch (this) {
            case January: out =  "Январь";
                break;
            case February: out = "Февраль";
                break;
            case March: out = "Март";
                break;
            case April: out = "Апрель";
                break;
            case May: out = "Май";
                break;
            case June: out = "Июнь";
                break;
            case July: out = "Июль";
                break;
            case August: out = "Август";
                break;
            case September: out = "Сентябрь";
                break;
            case October: out = "Октябрь";
                break;
            case November: out = "Ноябрь";
                break;
            case December: out = "Декабрь";
                break;
            default: out = "";
        }
        return out + ' ' + days;
    }

    static public void printAll(StringBuffer out){
        for (Month month : values()){
            out.append(month).append(" ").append(month.getSeason()).append("\n");
        }
    }

}

public class MonthTest {
    static public void testMonth(StringBuffer out){
        Month month = Month.April;
        out.append("Сейчас ").append(month)
                .append("\nПредыдущий ").append(month.previous())
                .append("\nСледующий ").append(month.next())
                .append("\n");
        Month.printAll(out);
    }
}
