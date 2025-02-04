public class Lengthoflongestconsecutiveones {
    public static int solve(String A) {
        //Brute Force
        /*int maxLength = 0;
        int currentCount = 0;
        int previousCount = 0;
        int totalOnes = 0;
        boolean hasZero = false;

        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == '1') {
                currentCount++;
                totalOnes++;
            } else {
                maxLength = Math.max(maxLength, previousCount + currentCount);
                previousCount = currentCount;
                currentCount = 0;
                hasZero = true;
            }
        }

        maxLength = Math.max(maxLength, previousCount + currentCount);

        if(hasZero && totalOnes > 0) {
            maxLength++;
        }
        return totalOnes == 0 ? 0 : maxLength;
    }*/
    //Optimized Approach
    int maxLength = 0;
    int currentCount = 0;
    int previousCount = 0;
    boolean hasZero = false;

    for(int i = 0; i < A.length(); i++) {
        if(A.charAt(i) == '1') {
            currentCount++;
        } else {
            maxLength = Math.max(maxLength, previousCount + currentCount);
            previousCount = currentCount;
            currentCount = 0;
            hasZero = true;
        }
    }
    maxLength = Math.max(maxLength, previousCount + currentCount);

    if(hasZero) {
        maxLength++;
    }
    return maxLength;
}
    public static void main(String[] args) {

        String input1 = "111000";
        String input2 = "111011101";

        System.out.println("Output for input1: " + Lengthoflongestconsecutiveones.solve(input1));
        System.out.println("Output for input1: " + Lengthoflongestconsecutiveones.solve(input2));
        
    }
}