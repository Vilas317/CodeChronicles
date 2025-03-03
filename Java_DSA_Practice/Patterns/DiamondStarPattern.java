package Java_DSA_Practice.Patterns;

public class DiamondStarPattern {
    public static void nStarDiamond(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-i-1; j++) {
            System.out.print(" ");
        }
          for (int j = 0; j < 2*i+1; j++) {
            System.out.print("*");
        }
          for (int j = 0; j < n-i-1; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
    for (int i = 0; i < n; i++) {
       for (int j = 0; j < i; j++) {
           System.out.print(" ");
       }
         for (int j = 0; j < 2*n-(2*i+1); j++) {
           System.out.print("*");
       }
         for (int j = 0; j < i; j++) {
           System.out.print(" ");
       }
       System.out.println();
   }
}
   public static void main(String[] args) {
    int n = 5;
    nStarDiamond(n);
}
}