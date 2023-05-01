package day_278;

import java.util.Arrays;

/**
 * <a href = "https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/" >
 * 1491. Average Salary Excluding the Minimum and Maximum Salary </a>
 * <p>
 * You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
 * <p>
 * Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
 */

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public double average(int[] salary) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0.0;

        for (int j : salary) {
            min = Math.min(j, min);
            max = Math.max(j, max);
            sum += j;
        }

        return (sum - min - max) / (salary.length - 2);
    }


    public double average_streams(int[] salary) {
        Arrays.sort(salary);
        return Arrays.stream(salary)
                .filter(i -> i != salary[0] && i != salary[salary.length - 1])
                .average()
                .getAsDouble();
    }
}
