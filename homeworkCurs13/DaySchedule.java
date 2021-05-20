package homeworkCurs13;

import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private Days day;
    private final List<String> activities;

    public DaySchedule(Days days, List<String> activities) {
        this.day = days;
        this.activities = activities;
    }

    public Days getDays() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "days=" + day +
                ", activities=" + activities +
                '}';
    }

    public Object getDay() {
        return day;
    }

    public void setDay(Object day) {
        this.day = (Days) day;
    }
}
