package day_007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalendar_ArraySolutionTest {

    @Test
    void shouldCorrectlyDetectBookingOverlaps() {
        MyCalendar_Arrays myCalendar = new MyCalendar_Arrays();
        assertTrue(myCalendar.book(10, 20));
        assertFalse(myCalendar.book(15, 25));
        assertTrue(myCalendar.book(20, 30));
    }

    @Test
    void shouldCorrectlyDetectComplexOverlaps() {
        // [[],[47,50],[33,41],[39,45],[33,42],[25,32],[26,35],[19,25],[3,8],[8,13],[18,27]]
        // [null,true,true,false,false,true,false,true,true,true,false]

        MyCalendar_Arrays myCalendar = new MyCalendar_Arrays();

        assertTrue(myCalendar.book(47, 50));
        assertTrue(myCalendar.book(33, 41));
        assertFalse(myCalendar.book(39, 45));
        assertFalse(myCalendar.book(33, 42));
        assertTrue(myCalendar.book(25, 32));
        assertFalse(myCalendar.book(26, 35));
        assertTrue(myCalendar.book(19, 25));
        assertTrue(myCalendar.book(3, 8));
        assertTrue(myCalendar.book(8, 13));
        assertFalse(myCalendar.book(18, 27));
    }
}