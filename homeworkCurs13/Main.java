package homeworkCurs13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner=new DailyPlanner(List.of(
                new DaySchedule(Days.MONDAY,List.of("activity")),
                new DaySchedule(Days.WEDNESDAY,List.of("activity")),
                new DaySchedule(Days.THURSDAY,List.of("activity1")),
                new DaySchedule(Days.FRIDAY,List.of("activity")),
                new DaySchedule(Days.SATURDAY,List.of("activity"))
                ));
        System.out.println(dailyPlanner.add.Activity(Days.THURSDAY,"activity"));
    }
}
