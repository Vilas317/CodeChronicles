public class SimpleReverse {
    public static String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String input1 = "scaler";
        String output1 = SimpleReverse.solve(input1);
        System.out.println(output1);

        String input2 = "academy";
        String output2 = SimpleReverse.solve(input2);
        System.out.println(output2);
        
    }
    
}