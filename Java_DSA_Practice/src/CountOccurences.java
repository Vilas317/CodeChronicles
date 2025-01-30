public class CountOccurences {
    public static int solve(int[] A, int B) {
        int count = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] == B) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 2};
        int B1 = 2;
        System.out.println(CountOccurences.solve(A1, B1));

        int[] A2 = {1, 2, 1};
        int B2 = 3;
        System.out.println(CountOccurences.solve(A2, B2));
        }
    }
