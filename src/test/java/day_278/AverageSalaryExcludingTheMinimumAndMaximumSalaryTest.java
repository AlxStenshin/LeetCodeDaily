package day_278;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

    @Test
    void shouldReturn_2500() {
        int[] salary = {4000, 3000, 1000, 2000};
        double average = 2500.0;

        assertEquals(average, new AverageSalaryExcludingTheMinimumAndMaximumSalary().average(salary));
    }

    @Test
    void shouldReturn_2000() {

        int[] salary = {1000, 2000, 3000};
        double average = 2000.0;

        assertEquals(average, new AverageSalaryExcludingTheMinimumAndMaximumSalary().average(salary));
    }

    @Test
    void shouldReturn_2500_streams() {
        int[] salary = {4000, 3000, 1000, 2000};
        double average = 2500.0;

        assertEquals(average, new AverageSalaryExcludingTheMinimumAndMaximumSalary().average_streams(salary));
    }

    @Test
    void shouldReturn_2000_streams() {

        int[] salary = {1000, 2000, 3000};
        double average = 2000.0;

        assertEquals(average, new AverageSalaryExcludingTheMinimumAndMaximumSalary().average_streams(salary));
    }

}