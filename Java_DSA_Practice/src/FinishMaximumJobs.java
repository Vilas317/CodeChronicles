import java.util.Arrays;

public class FinishMaximumJobs {
    public int solve(int[] A, int[] B) {
        int n = A.length;

        Job[] jobs = new Job[n];
        for(int i = 0; i < n; i++) {
            jobs[i] = new Job(A[i], B[i]);
        }
        Arrays.sort(jobs, (a, b) -> a.finish - b.finish);

        int maxJobs = 0;
        int lastFinishTime = 0;

        for(Job job : jobs) {
            if(job.start >= lastFinishTime) {
                maxJobs++;
                lastFinishTime = job.finish;
            }
        }
        return maxJobs;
    }
    
    static class Job {
        int start, finish;

        Job(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static void main(String[] args) {
        FinishMaximumJobs solution =  new FinishMaximumJobs();
        // Example Input 1
        int[] A1 = {1, 5, 7, 1};
        int[] B1 = {7, 8, 8, 8};
        System.out.println(solution.solve(A1, B1));

        // Example Input 2
        int[] A2 = {3, 2, 6};
        int[] B2 = {9, 8, 9};
        System.out.println(solution.solve(A2, B2));
    }
}
