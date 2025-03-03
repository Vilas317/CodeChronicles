package Java_DSA_Practice.Patterns;

public class InvertedRightPyramid {
    public static void seeding(int n) {
        for (int i = 0; i <= n; i++) {
              for (int j = n; j > i; j--) {
                  System.out.print("* ");
              }
              System.out.println();
          }
      }
      public static void main(String[] args) {
        int n = 5;
        seeding(n);
    }
} 
