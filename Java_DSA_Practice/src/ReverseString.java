public class ReverseString {
    public static String solve(String A) {
        
        A = A.trim();

        String[] words = A.split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if(i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        
        String A1 = "the sky is blue";
        System.out.println("Output1: \"" + ReverseString.solve(A1) + "\"");
        

        String A2 = "reverse is this";
        System.out.println("Output1: \"" + ReverseString.solve(A2) + "\"");
    }
    
}
