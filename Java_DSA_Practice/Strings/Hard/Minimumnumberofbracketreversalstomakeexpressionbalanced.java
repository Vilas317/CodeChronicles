package Java_DSA_Practice.Strings.Hard;

public class Minimumnumberofbracketreversalstomakeexpressionbalanced {
    public static int minimumParentheses(String pattern) {
        int open = 0;
        int insertion = 0;

        for (char ch : pattern.toCharArray()) {
            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--; 
                } else {
                    insertion++;
                }
            }
        }

        return insertion + open;
    }
    
    public static void main(String[] args) {
        test("())(", 2);
        test("(((", 3);
        test("))", 2);
        test("()", 0);
        test("(()())", 0);
        test("", 0);
        test("())())", 2);
    }

    public static void test(String input, int expected) {
        int result = Minimumnumberofbracketreversalstomakeexpressionbalanced.minimumParentheses(input);
        if (result == expected) {
            System.out.println("✅ Test passed for input: \"" + input + "\" → Output: " + result);
        } else {
            System.out.println("❌ Test failed for input: \"" + input + "\"");
            System.out.println("   Expected: " + expected + ", Got: " + result);
        }
    }
}
