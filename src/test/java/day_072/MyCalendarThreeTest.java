package day_072;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalendarThreeTest {

    @Test
    void shouldPerformCorrectBehavior() {
        MyCalendarThree myCalendarThree = new MyCalendarThree();

        // The first event can be booked and is disjoint, so the maximum k-booking is a 1-booking.
        assertEquals(1, myCalendarThree.book(10, 20));

        // The second event can be booked and is disjoint, so the maximum k-booking is a 1-booking.
        assertEquals(1, myCalendarThree.book(50, 60));

        // The third event [10, 40) intersects the first event, and the maximum k-booking is a 2-booking.
        assertEquals(2, myCalendarThree.book(10, 40));

        // The remaining events cause the maximum K-booking to be only a 3-booking.
        assertEquals(3, myCalendarThree.book(5, 15));
        assertEquals(3, myCalendarThree.book(5, 10));
        assertEquals(3, myCalendarThree.book(25, 55));
    }

}