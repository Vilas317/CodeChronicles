package Java_DSA_Practice.Patterns;


public class RightAngledNumberPyramid {
    public static void nTriangle(int n) {
        for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }    
        public static void main(String[] args) {
            int n = 5;
            nTriangle(n);
        }
    }    
