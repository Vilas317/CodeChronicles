public class CapacityofShipPackageswithinDDays {
    public static int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;
        int n = weights.length;
        for(int i = 0; i < n; i++) {
            if(load + weights[i] > cap) {
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        } 
        return days;
    }
    public static int leastWeightCapacity(int[] weights, int d) {
    //     int maxm = Integer.MIN_VALUE, sum = 0;
    //     for(int i = 0; i < weights.length; i++) {
    //         sum += weights[i];
    //         maxm = Math.max(maxm, weights[i]);
    //     }
    //     for(int i = maxm; i <= sum; i++) {
    //         if(findDays(weights, i) <= d) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    int low = Integer.MIN_VALUE, high = 0;
    for(int i = 0; i < weights.length; i++) {
        high += weights[i];
        low = Math.max(low, weights[i]); 
    }
    while(low<=high) {
        int mid = (low+high)/2;
        int numberOfDays = findDays(weights, mid);
        if(numberOfDays <= d) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return low;
}
public static void main(String[] args) {
    int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
    int d = 5;
    int ans = leastWeightCapacity(weights, d);
    System.out.println("The minimum capacity should be: " + ans);
}
}


