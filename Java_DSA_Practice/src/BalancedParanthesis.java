import java.util.Stack;

public class BalancedParanthesis {
    public int solve(String A) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if(ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }
            else if(ch == '}' || ch == ')' || ch == ']') {

                if(stack.isEmpty()) {
                    return 0;
                }
                char top = stack.pop();
                if((ch == '}' && top != '{') || (ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                    return 0;
                }

            }
        }
    
    return stack.isEmpty() ? 1 : 0;
    }
    public static void main (String[] args) {
		
		String s="()[{}()]";
		if(isValid(s)==true)
		System.out.println("True");
		else
		System.out.println("False");
	}
    private static boolean isValid(String s) {
        return false;
    }
    
}