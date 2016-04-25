package com.example.project_mt23.topic_1_08.enums;

import static com.example.project_mt23.topic_1_08.enums.DayOfWeekTest.testDayOfWeek;
import static com.example.project_mt23.topic_1_08.enums.MonthTest.testMonth;
import static com.example.project_mt23.topic_1_08.enums.SeasonTest.testSeason;

/**
 * Created by Initb on 25.04.2016.
 */
public class Enums {

    static public void testEnums(StringBuffer out){
        testDayOfWeek(out.append("\n"));
        testSeason(out.append("\n"));
        testMonth(out.append("\n"));
    }

}
