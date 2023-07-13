package day_351;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    @Test
    void shouldReturnFalse() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        assertFalse(new CourseSchedule().canFinish(numCourses, prerequisites));
    }

    @Test
    void shouldReturnTrue() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        assertTrue(new CourseSchedule().canFinish(numCourses, prerequisites));
    }
}