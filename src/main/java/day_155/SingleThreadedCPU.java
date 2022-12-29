package day_155;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/single-threaded-cpu/">
 *     1834. Single-Threaded CPU </a>
 * <p>
 * You are given n tasks labeled from 0 to n - 1 represented by a 2D integer array tasks, where tasks[i] = [enqueueTime_i, processingTime_i] means that the i-th task will be available to process at enqueueTime_i and will take processingTime_i to finish processing.
 * <p>
 * You have a single-threaded CPU that can process at most one task at a time and will act in the following way:
 * <p>
 * If the CPU is idle and there are no available tasks to process, the CPU remains idle.<br>
 * If the CPU is idle and there are available tasks, the CPU will choose the one with the shortest processing time. If multiple tasks have the same shortest processing time, it will choose the task with the smallest index.<br>
 * Once a task is started, the CPU will process the entire task without stopping.<br>
 * The CPU can finish a task then start a new one instantly.
 * <p>
 * Return the order in which the CPU will process the tasks.
 */

public class SingleThreadedCPU {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        CpuTask[] scheduled = new CpuTask[n];
        int[] order = new int[n];

        for (int i = 0; i < n; i++) {
            scheduled[i] = new CpuTask(i, tasks[i][0], tasks[i][1]);
        }

        Arrays.sort(scheduled, new ScheduleComparator());

        PriorityQueue<CpuTask> available = new PriorityQueue<>(new AvailableComparator());

        int time = 0;
        int orderIdx = 0;
        int i = 0;

        while (orderIdx < n) {
            if (available.isEmpty()) {
                time = Math.max(time, scheduled[i].enqueueTime);
            }

            while (i < n && scheduled[i].enqueueTime <= time) {
                available.add(scheduled[i]);
                i++;
            }

            CpuTask curTask = available.poll();
            order[orderIdx++] = curTask.index;
            time += curTask.processingTime;
        }
        return order;
    }

    static class CpuTask  {
        int enqueueTime;
        int processingTime;
        int index;

        public CpuTask(int index, int enqueueTime, int processingTime) {
            this.index = index;
            this.enqueueTime = enqueueTime;
            this.processingTime = processingTime;
        }
    }

    private static class ScheduleComparator implements Comparator<CpuTask> {
        @Override
        public int compare(CpuTask t1, CpuTask t2) {
            if (t1.enqueueTime == t2.enqueueTime)
                return t1.processingTime - t2.processingTime;
            return t1.enqueueTime - t2.enqueueTime;
        }
    }

    private static class AvailableComparator implements Comparator<CpuTask> {
        @Override
        public int compare(CpuTask t1, CpuTask t2) {
            if (t1.processingTime == t2.processingTime)
                return t1.index - t2.index;
            return t1.processingTime - t2.processingTime;
        }
    }

}
