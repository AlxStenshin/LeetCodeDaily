package day_007;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar_Arrays {
    List<int[]> bookings;

    MyCalendar_Arrays() {
        bookings = new ArrayList();
    }

    public boolean book(int start, int end) {
        for (int[] temp : bookings) {
            if (temp[0] < end && start < temp[1]) {
                return false;
            }
        }
        bookings.add(new int[]{start, end});
        return true;
    }
}
