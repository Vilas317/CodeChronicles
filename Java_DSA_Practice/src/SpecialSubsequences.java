public class SpecialSubsequences {
    public static Long solve(String A) {
        long countA = 0;
        long result = 0;

        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(c == 'A') {
                countA++;
            } else if(c == 'G') {
                result += countA;
            }
        } 
        return result;
    }
    public static void main(String[] args) {
        SpecialSubsequences solve = new SpecialSubsequences();

        String A1 = "ABCGAG";
        System.out.println(SpecialSubsequences.solve(A1));

        String A2 = "GAB";
        System.out.println((SpecialSubsequences.solve(A2)));
        
    }
    
}
