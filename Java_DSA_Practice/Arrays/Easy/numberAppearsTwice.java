package Java_DSA_Practice.Arrays.Easy;

public class numberAppearsTwice {
    public static int getSingleElement(int[] arr) {
        // Brute force
        /*
         * int n = arr.length;
         * for(int i = 0; i < n; i++) {
         * int num = arr[i];
         * int cnt = 0;
         * 
         * for(int j = 0; j < n; j++) {
         * if(arr[j] == num)
         * cnt++;
         * }
         * if(cnt==1)
         * return num;
         * }
         * return -1;
         * }
         */
        // Better Approach - Hashing
        /*
         * int n = arr.length;
         * int maxm = arr[0];
         * for(int i = 0; i < n; i++) {
         * maxm = Math.max(maxm, arr[i]);
         * }
         * int[] hash = new int[maxm+1];
         * for(int i= 0; i < n; i++) {
         * hash[arr[i]]++;
         * }
         * for(int i = 0; i < n; i++) {
         * if(hash[arr[i]] == 1)
         * return arr[i];
         * }
         * return -1;
         * }
         */
        // Optimal Approach - Using XORR
        int n = arr.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String args[]) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
