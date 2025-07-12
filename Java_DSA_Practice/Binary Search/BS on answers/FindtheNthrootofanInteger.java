public class FindtheNthrootofanInteger {
    // public static long func(int b, int exp) {
    //     long ans = 1;
    //     long base = b;
    //     while(exp > 0) {
    //         if(exp % 2 == 1) {
    //             exp--;
    //             ans = ans * base;
    //         } else {
    //             exp /= 2;
    //             base = base * base;
    //         }
    //     }
    //     return ans;
    // }
    // public static int NthRoot(int n, int m) {
    //     for(int i = 1; i <= m; i++) {
    //         long val = func(i, n);
    //         if(val == (long)m) return i;
    //         else if(val > (long)m) break;
    //     }
    //     return -1;
    // }
    
    //Optimal Approach
    public static int func(int mid, int n, int m) {
        long ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = ans * mid;
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
    public static int NthRoot(int n, int m) {
        int low = 1, high = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            int midN = func(mid, n, m);
            if(midN == 1) {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
}
