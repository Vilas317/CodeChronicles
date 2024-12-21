import java.util.*;
public class SingleNumberIII {
    public int[] solve(int[] A) {
        //Brute force
        // Step 1: Use a HashMap to store frequency
       /* Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : A) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Collect the elements that appear only once
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }

        // Step 3: Convert to array and sort
        int[] result = new int[2];
        result[0] = uniqueNumbers.get(0);
        result[1] = uniqueNumbers.get(1);
        Arrays.sort(result); // Ensure ascending order

        return result;
    }
}*/
//optimized approach
// Step 1: XOR all elements to get XOR of the two unique numbers
        int xor = 0;
        for (int num : A) {
            xor ^= num;
        }

        // Step 2: Find the rightmost set bit
        int rightmostSetBit = xor & -xor;

        // Step 3: Partition the numbers into two groups and XOR within each group
        int num1 = 0, num2 = 0;
        for (int num : A) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        // Step 4: Return the two numbers in ascending order
        int[] result = new int[] { num1, num2 };
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        SingleNumberII solution = new SingleNumberII();
    
        System.out.println(solution.singleNumber(new int[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1}));
        System.out.println(solution.singleNumber(new int[]{0, 0, 0, 1}));
    }
}