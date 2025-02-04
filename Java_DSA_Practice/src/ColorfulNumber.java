import java.util.HashSet;

public class ColorfulNumber {
    public static int colorful(int A) {
        String numStr = Integer.toString(A);
        HashSet<Integer> producSet = new HashSet<>();

        for(int i = 0; i < numStr.length(); i++) {
            int product = 1;

            for(int j = i; j < numStr.length(); j++) {
                int digit = numStr.charAt(j) - '0';
                product *= digit;

                if(producSet.contains(product)) {
                    return 0;
                }
                producSet.add(product);
            }
        }
        return 1;
    }
    public static void main(String[] args) {

        int A1 = 23;
        System.out.println("Input: " + A1 + ", Output: " + ColorfulNumber.colorful(A1));

        int A2 = 236;
        System.out.println("Input: " + A2 + ", Output: " + ColorfulNumber.colorful(A2));
    }
}