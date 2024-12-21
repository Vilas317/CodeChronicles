public class MinimumBitFlipstoConvertNumber {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal; // XOR to find differing bits
        int count = 0;

        // Count set bits in XOR result
        while (xor > 0) {
            count += xor & 1; // Check if the last bit is set
            xor >>= 1;        // Shift right to check the next bit
        }

        return count;
    }

    public static void main(String[] args) {
        MinimumBitFlipstoConvertNumber solution = new MinimumBitFlipstoConvertNumber();
        
        int start = 10; // Correct initialization
        int goal = 3;
        
        // Call the method and print the result
        System.out.println("Minimum bit flips: " + solution.minBitFlips(start, goal));
    }
}
