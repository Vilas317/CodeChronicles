public class SingleNumber {
    public int singleNumber(final int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        System.out.println(solution.singleNumber(new int[]{1, 2, 2, 3, 1})); // Output: 3
        System.out.println(solution.singleNumber(new int[]{1, 2, 2}));       // Output: 1
    }
}
