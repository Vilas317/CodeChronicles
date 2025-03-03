package Java_DSA_Practice.Patterns;

public class InvertedNumberRightPyramid {    
    public static void nNumberTriangle(int n) {
        for (int i = 0; i <= n; i++) {
              for (int j = n; j > i; j--) {
                  System.out.print(n-j+1+" ");
                }
              System.out.println();
            }
        }
        public static void main(String[] args) {
            int n = 5;
            nNumberTriangle(n);
        }
    } 
