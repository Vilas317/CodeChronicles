import java.util.*;

public class Painterspartition {
    public static int countPainters(ArrayList<Integer> boards, int time) {
        int n = boards.size();
        int painters = 1;
        long boardsPainter = 0;
        for(int i = 0; i < n; i++) {
        if(boardsPainter + boards.get(i) <= time) {
            boardsPainter += boards.get(i);
        } else {
            painters++;
            boardsPainter = boards.get(i);
        }
    }
    return painters;
}
public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
    int low = Collections.max(boards);
    int high = boards.stream().mapToInt(Integer::intValue).sum();
//     for(int time = low; time <= high; time++) {
//         if(countPainters(boards, time) <= k)
//         return time;
//     }
//     return low;
// }

while(low <= high) {
    int mid = (low+high)/2;
    int painters = countPainters(boards, mid);
    if(painters > k) {
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}
return low;
}
public static void main(String[] args) {
    ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    int k = 2;
    int ans = findLargestMinDistance(boards, k);
    System.out.println("The answer is: " + ans);
}
}