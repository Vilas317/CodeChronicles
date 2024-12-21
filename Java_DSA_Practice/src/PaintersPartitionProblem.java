public class PaintersPartitionProblem {
    public int paint(int A, int B, int[] C) {
        //Brute force
        /*int low = 0;
        int high = 0;
        for(int length : C) {
            low = Math.max(low, length);
            high += length;
        }
        int result = high;

        for(int time = low; time <= high; time++) {
            if(countPainters(C, time) <= A) {
                result = Math.min(result, time);
            }
        }

        return (int)((long)result * B % 10000003);
    }

    private int countPainters(int[] boards, int time) {
        int painters = 1;
        int boardsPainter = 0;

        for(int length : boards) {
            if(boardsPainter + length <= time) {
                boardsPainter += length;
            } else {
                painters++;
                boardsPainter = length;
            }
        }
        return painters;
    }
    public static void main(String[] args) {
        PaintersPartitionProblem solution = new PaintersPartitionProblem();
        int A = 2; // Number of painters
        int B = 5; // Time per unit of board
        int[] C = {1, 10}; // Array representing board lengths

        int result = solution.paint(A, B, C);
        System.out.println("The minimum time required is:" + result);
    }
}*/
//Optimal Approach
int low = 0;
        int high = 0;
        for(int length : C) {
            low = Math.max(low, length);
            high += length;
        }
     while (low < high) {
        int mid = low + (high - low) / 2;
        if(countPainters(C, mid) <= A) {
            high = mid;
        } else {
            low = mid + 1;
        }
     }
     return (int)((long)low * B % 10000003); 
    }

    private int countPainters(int[] boards, int time) {
        int painters = 1;
        int boardsPainter = 0;

        for(int length : boards) {
            if(boardsPainter + length <= time) {
                boardsPainter += length;
            } else {
                painters++;
                boardsPainter = length;
            }
        }
        return painters;
    }
    public static void main(String[] args) {
        PaintersPartitionProblem solution = new PaintersPartitionProblem();
        int A = 2; // Number of painters
        int B = 5; // Time per unit length of board
        int[] C = {1, 10}; // Array of board lengths

        int result = solution.paint(A, B, C);
        System.out.println("The minimum time required is: " + result);

        // Test case 2
        int A2 = 10;
        int B2 = 1;
        int[] C2 = {1, 8, 11, 3};
        result = solution.paint(A2, B2, C2);
        System.out.println("The minimum time required is: " + result);
    }
}