package Java.TaskScheduler;


import java.util.Arrays;
import java.util.HashMap;

/*     621. Task Scheduler
 You are given an array of CPU tasks,
 each represented by letters A to Z,
 and a cooling time, n. Each cycle or
 interval allows the completion of one
 task. Tasks can be completed in any
 order, but there's a constraint:
 identical tasks must be separated
 by at least n intervals due to cooling time.

Return the minimum number of intervals required to complete all tasks.*/
public class Solution {
    public static void main(String[] args) {

    }


    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        Arrays.sort(freq);

        int maxFreq = freq[25];
        int idleSlots = (maxFreq - 1) * n;

        for (int i = 24; i >= 0 && idleSlots > 0; i--) {
            idleSlots -= Math.min(freq[i], maxFreq - 1);
        }

        idleSlots = Math.max(0, idleSlots); // idleSlots is non-negative

        return tasks.length + idleSlots;
    }


}
