public class StringOperations {
    public static String solve(String A) {
        
        StringBuilder sb = new StringBuilder(A).append(A);

        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(Character.isUpperCase(ch))
            continue;
            if(vowels.indexOf(ch) != -1) {
                result.append('#');
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input1 = "aeiou";
        System.out.println(StringOperations.solve(input1));

        String input2 = "AbcaZeoB";
        System.out.println(StringOperations.solve(input2));
        
    }
    
}
