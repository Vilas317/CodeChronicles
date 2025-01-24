public class GoodSubarrays {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;

        for(int start = 0; start < n; start++){
            int sum = 0;

            for(int end = start; end < n; end++){
                sum += A[end];

                int length = end -start + 1;

                if((length % 2== 0 && sum < B) || (length % 2 ==1 || sum > B)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        GoodSubarrays goodSubarrays = new GoodSubarrays();
        
        int[] A1 = {1, 2, 3, 4, 5};
        int B1 = 4;
        System.out.println(goodSubarrays.solve(A1, B1));

        int[] A2 = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B2 = 65;
        System.out.println(goodSubarrays.solve(A2, B2));
    }
}
