package Java_DSA_Practice.Patterns;

public class InvertedStarPyramid {
    public static void nStarTriangle(int n) {
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
    nStarTriangle(n);
}
}
