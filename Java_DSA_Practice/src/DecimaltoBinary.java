import java.util.*;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            System.out.println(decimalToBinary(A));
        }
    }
    public static String decimalToBinary(int A) {
        if (A == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (A > 0) {
            int remainder = A % 2;
            binary.insert(0, remainder);
            A /= 2;
        }
        return binary.toString();
    }
}