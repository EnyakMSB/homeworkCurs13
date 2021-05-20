package homeworkCurs13;

import java.util.ArrayList;
import java.util.List;

public class DailyPlanner {
    private final List<DaySchedule> activities=new ArrayList<>();

    public DailyPlanner(List<DaySchedule> activities) {
        this.activities.addAll(activities);
    }

    private DaySchedule addDailyActivity(Days day, String newActivity) {
        for (DaySchedule activity : activities) {
            if (activity.getDay().equals(day)) {
                List<String> newList = new ArrayList<>(activity.getActivities());
                if (activity.getActivities() == null) {
                    newList = new ArrayList<>();
                }
                newList.add(newActivity);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "activities=" + activities +
                '}';
    }
}
