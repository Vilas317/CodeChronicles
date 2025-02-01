public class CountOccurencesString {
    public static int solve(String A) {
        int ans = 0;
        int length = A.length();

        for(int i = 0; i <= length - 3; i++) {
            if(A.charAt(i) == 'b' && A.charAt(i + 1) == 'o' && A.charAt(i + 2) == 'b') {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        String input1 = "abobc";
        String input2 = "bobob";

        System.out.println(CountOccurencesString.solve(input1));
        System.out.println(CountOccurencesString.solve(input2));
        
    }
    
}
