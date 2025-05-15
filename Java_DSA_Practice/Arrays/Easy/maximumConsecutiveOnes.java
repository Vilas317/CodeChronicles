package Java_DSA_Practice.Arrays.Easy;

public class maximumConsecutiveOnes {
    static int findMaxConsecutiveOnes(int nums[]) {
        int cnt = 0;
        int maxm = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            maxm = Math.max(maxm, cnt);
        }
        return maxm;
    }
    public static void main(String args[]) {
        int nums[] = { 1, 1, 0, 1, 1, 0, 1, 1, -1, 1, 1, 1, 1, 1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}
