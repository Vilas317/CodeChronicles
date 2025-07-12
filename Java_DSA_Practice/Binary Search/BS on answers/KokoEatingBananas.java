public class KokoEatingBananas {
    public static int findMax(int[] v) {
        int maxm = Integer.MIN_VALUE;
        int n = v.length;
        for(int i = 0; i < n; i++) {
            maxm = Math.max(maxm, v[i]);
        }
        return maxm;
    }
    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        for(int i = 0; i < n; i++) {
            totalH += ((double)(v[i]/(double)(hourly)));
        }
        return totalH;
    }
    public static int minimumRateToEatBananas(int[] v, int h) {
    //     int maxm = findMax(v);
    //     for(int i = 1; i < maxm; i++) {
    //         int reqTime = calculateTotalHours(v, i);
    //         if(reqTime <= h) {
    //             return i;
    //         }
    //     }
    //     return maxm;
    // }

    //Optimal Approach
    int low = 1, high = findMax(v);
    while(low<=high) {
        int mid = (low+high)/2;
        int totalH = calculateTotalHours(v, mid);
        if(totalH <= h) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return low;
}
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}