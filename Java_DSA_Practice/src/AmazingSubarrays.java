public class AmazingSubarrays {
    public static int solve(String A) {

        String vowels = "aeiouAEIOU";
        int n = A.length();
        long ans = 0;

        for(int i = 0; i < n; i++) {
            if(vowels.indexOf(A.charAt(i)) != -1) {
                ans += (n - i);
            }
        }
        return (int)(ans % 10003);

    }

    public static void main(String[] args) {
        
        String input = "ABEC";

        System.out.println(AmazingSubarrays.solve(input));
        
    }
    
}
