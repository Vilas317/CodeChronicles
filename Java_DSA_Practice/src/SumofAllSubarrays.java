public class SumofAllSubarrays {
    public long subarraySum(int[] A) {
        //Brute Force
        /*int n = A.length;
        long totalSum = 0;

        for(int i = 0; i < n; i++) {
            long currentSum = 0;

            for(int j = i; j < n; j++) {
                currentSum += A[j];
                totalSum += currentSum;
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        SumofAllSubarrays solution = new SumofAllSubarrays();
    
        int[] A1 = {1, 2, 3};
        System.out.println(solution.subarraySum(A1));
    
        int[] A2 = {2, 1, 3};
        System.out.println(solution.subarraySum(A2));
    }
}*/
        //Optimal
        int n = A.length;
        long totalSum = 0;

        for(int i = 0; i < n; i++) {
            long contritbution = (long) A[i] * (i + 1) * (n - i);
            totalSum += contritbution;

        }
        return totalSum;
    }
    public static void main(String[] args) {
        SumofAllSubarrays solution = new SumofAllSubarrays();
    
        int[] A1 = {1, 2, 3};
        System.out.println(solution.subarraySum(A1));
    
        int[] A2 = {2, 1, 3};
        System.out.println(solution.subarraySum(A2));
    }
}

