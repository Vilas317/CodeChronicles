public class Isalnum {
    public static int solve(char[] A) {
        int n = A.length;
        for(int i = 0; i < n; i++) {
            char c = A[i];
            if((c >= 'A' && c<= 'Z') || (c >= 'a' && c<= 'z') || (c >= '0' && c<= '9')) {
                continue;
            }
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        
        char[] A1 = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println("output 1: " + Isalnum.solve(A1));

        char[] A2 = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        System.out.println("output 2: " + Isalnum.solve(A2));
        
    }
    
}
