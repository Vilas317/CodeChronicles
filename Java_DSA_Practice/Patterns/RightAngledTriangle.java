package Java_DSA_Practice.Patterns;

public class RightAngledTriangle {
    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        nForest(n);
    }
}
