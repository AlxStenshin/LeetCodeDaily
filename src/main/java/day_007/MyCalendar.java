package day_007;

import java.util.ArrayList;
import java.util.List;

/**
 * 729. My Calendar I
 * https://leetcode.com/problems/my-calendar-i/
 *
 * You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.
 *
 * A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events.).
 *
 * The event can be represented as a pair of integers start and end that represents a booking on the half-open interval [start, end), the range of real numbers x such that start <= x < end.
 *
 * Implement the MyCalendar class:
 *
 * MyCalendar() Initializes the calendar object.
 * boolean book(int start, int end) Returns true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.
 */

public class MyCalendar {

    List<BookingInterval> bookingList = new ArrayList<>();

    public boolean book(int start, int end) {
        return add(new BookingInterval(start, end));
    }

    private boolean add(BookingInterval booking) {
        if (bookingList.stream()
                .anyMatch(b -> b.startsInside(booking) && b.endsInside(booking)))
            return false;
        else {
            bookingList.add(booking);
            return true;
        }
    }

    private static class BookingInterval {
        final int start;
        final int end;

        public BookingInterval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        /*
        this:    |____
        book:  ____|
        */
        public boolean endsInside(BookingInterval book) {
            return this.getStart() < book.getEnd();
        }

        /*
        this:    ____|
        book:      |____
        */
        public boolean startsInside(BookingInterval book) {
            return book.getStart() < this.getEnd();
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
