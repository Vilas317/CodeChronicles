import java.util.Arrays;

public class SingleNumberII {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        // Create a map to store the frequency of each number
        //Brute force
       /* Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Populate the frequency map
        for (int num : A) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the element that appears only once
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        // This line will never be reached if the input is guaranteed to have one unique number
        return -1;
    }
}*/
//Better Approach
/*int result = 0;
for(int i = 0; i < 32; i++) {
    int bitSum = 0;

    for(int num : A) {
        if((num & (1 << i)) != 0) {
            bitSum++;
        }
    }
    if(bitSum % 3 != 0) {
        result |= (1 << i);
    }
}
return result;
}
public static void main(String[] args) {
    SingleNumberII solution = new SingleNumberII();

    System.out.println(solution.singleNumber(new int[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1}));
    System.out.println(solution.singleNumber(new int[]{0, 0, 0, 1}));
}
}*/
//optimised approach
Arrays.sort(A);
int n = A.length;
for(int i = 0; i < n - 1; i += 3){
    if(i + 1 >= n || A[i] != A[i + 1]) {
        return A[i];
    }
}
return A[n - 1];
}
public static void main(String[] args) {
    SingleNumberII solution = new SingleNumberII();

    System.out.println(solution.singleNumber(new int[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1}));
    System.out.println(solution.singleNumber(new int[]{0, 0, 0, 1}));
}
}
